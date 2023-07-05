package com.aasctc.template_rules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@SpringBootApplication
@Controller
public class TemplateRulesServer {

    public static void main(String[] args) {
        SpringApplication.run(TemplateRulesServer.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/process")
    public String processParameters(@RequestParam("inputFiles") MultipartFile[] inputFiles, Model model) {
        // Process the uploaded files and perform the desired operations
        // You can access the input files using the inputFiles parameter
        // Update the model with the result or any relevant information
        
        return "result";
    }
}
