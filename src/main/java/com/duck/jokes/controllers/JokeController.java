package com.duck.jokes.controllers;

import com.duck.jokes.services.JokeService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    JokeService jokeService;

    public JokeController(@Qualifier("chuckJokeService")JokeService jokeService) {
        System.out.println("**************** JokeController ****************");
        this.jokeService = jokeService;
    }


    @RequestMapping("/j")
    public String getJokes(Model model) {
        String joke = jokeService.getJoke();
        model.addAttribute("jokes", joke);

        return "jokes/jokes";
    }
}
