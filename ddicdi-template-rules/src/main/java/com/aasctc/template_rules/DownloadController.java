package com.aasctc.template_rules;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.lucene.document.Document;

@Controller
public class DownloadController {
    @GetMapping("/download/{index}")
    public void download(@PathVariable int index, HttpServletResponse response, @ModelAttribute("searchResults") List<Document> searchResults) throws IOException {
        if (index >= 0 && index < searchResults.size()) {
            Document document = searchResults.get(index);
            String xmlContent = document.get("content"); // Assuming content is the XML as a string

            // Set the response headers for download
            response.setHeader("Content-Disposition", "attachment; filename=document.xml");
            response.setContentType("application/xml"); // Set the content type to XML

            // Convert the XML string to bytes
            byte[] xmlBytes = xmlContent.getBytes("UTF-8");

            // Write the XML bytes to the response output stream
            response.getOutputStream().write(xmlBytes);
        }
    }
}
