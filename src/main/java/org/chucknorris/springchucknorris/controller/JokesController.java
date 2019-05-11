package org.chucknorris.springchucknorris.controller;

import org.chucknorris.springchucknorris.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JokesController {

    private JokesService jokes;

    @Autowired
    public JokesController(JokesService jokes) {
        this.jokes = jokes;
    }

    @GetMapping
    public String getJoke(Model model) {
        model.addAttribute("title", "Chuck Norris Jokes");
        model.addAttribute("joke", jokes.getJoke());

        return "index";
    }
}
