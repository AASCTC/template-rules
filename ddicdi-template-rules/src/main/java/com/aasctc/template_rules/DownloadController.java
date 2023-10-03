package com.aasctc.template_rules;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@Controller
public class DownloadController {
    @GetMapping("/download/{index}")
    public void download(@PathVariable int index, HttpServletResponse response, HttpSession session) throws IOException {
    	List<ResultSet> searchResults = (List<ResultSet>) session.getAttribute("results");  
        if (index >= 0 && index < searchResults.size()) {
            ResultSet document = searchResults.get(index);
            String xmlContent = document.getContent();
            String fileName = document.getFilename();

            // Set the response headers for download
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
            response.setContentType("application/xml"); // Set the content type to XML

            // Convert the XML string to bytes
            byte[] xmlBytes = xmlContent.getBytes("UTF-8");

            // Write the XML bytes to the response output stream
            response.getOutputStream().write(xmlBytes);
        }
    }
}
