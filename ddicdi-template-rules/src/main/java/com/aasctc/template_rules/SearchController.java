package com.aasctc.template_rules;

import org.apache.lucene.document.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {
    @Autowired
    private IndexSearcherManager indexSearcherManager;

    @GetMapping("/")
    public String searchForm() {
        return "search-form";
    }

    @PostMapping("/search")
    public String search(@RequestParam String query, Model model) {
        try {
            List<Document> results = indexSearcherManager.searchByQuery(query);
            model.addAttribute("results", results);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "An error occurred during the search.");
        }
        return "search-results";
    }
}
