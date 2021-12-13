package com.duck.jokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service("chuckJokeService")
public class ChuckJokeService implements JokeService {

    ChuckNorrisQuotes chuckNorrisQuotes;


    
    public ChuckJokeService() {
        System.out.println("**************** ChuckJokeService ****************");
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }



    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();

    }
    
}
