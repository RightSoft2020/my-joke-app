package com.dhouse.jokeapp.myjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class JokeServiceImp implements JokeService {
    private final ChuckNorrisQuotes norrisQuotes;

    public JokeServiceImp(){
        norrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return norrisQuotes.getRandomQuote();
    }
}
