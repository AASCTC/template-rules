package com.aasctc.template_rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

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
    public String search(@RequestParam("q") String query, HttpSession session) {
        try {
            List<ResultSet> results = indexSearcherManager.searchByQuery(query);
            session.setAttribute("results", results);
        } catch (Exception e) {
            e.printStackTrace();
            session.setAttribute("error", "An error occurred during the search.");
        }
        return "search-results";
    }
}
