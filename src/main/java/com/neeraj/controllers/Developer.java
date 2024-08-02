package com.neeraj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {
   @Autowired
   @Qualifier("desktop")
   private Computer computer;
   // public Developer(Computer computer) {
   //  this.computer = computer;
   // }

   public void build() {
      computer.compile();
      System.out.println("Working on awesome project");
   }
}
