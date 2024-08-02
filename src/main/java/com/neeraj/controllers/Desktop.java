package com.neeraj.controllers;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compiling with 404 bugs faster");
    }

}