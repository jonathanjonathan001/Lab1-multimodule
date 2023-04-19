package org.example.provider;

import org.example.service.annotation.Language;

@Language("sv")
public class AnnotatedGreeting {


    public String hello() {
        return "Hej";
    }

}
