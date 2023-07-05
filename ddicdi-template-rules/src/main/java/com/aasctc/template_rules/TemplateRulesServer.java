package com.aasctc.template_rules;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TemplateRulesServer {

    @GetMapping("/")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/process")
    public DeferredResult<String> processFiles(@RequestParam("inputFiles") MultipartFile[] inputFiles,
                                               @RequestParam("rulesFile") MultipartFile rulesFile) {
        DeferredResult<String> deferredResult = new DeferredResult<>();

        // File processing logic here
        // ...

        // Complete the deferredResult and redirect to the result page
        deferredResult.setResult("redirect:/result");

        return deferredResult;
    }

    @GetMapping("/result")
    public ModelAndView showResult() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
