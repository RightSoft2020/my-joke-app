package com.dhouse.jokeapp.myjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp {
    private final ChuckNorrisQuotes norrisQuotes;

    public JokeServiceImp(){
        norrisQuotes = new ChuckNorrisQuotes();
    }
    String getJoke(){
        return norrisQuotes.getRandomQuote();
    }
}
