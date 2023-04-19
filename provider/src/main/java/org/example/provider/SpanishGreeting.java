package org.example.provider;

import org.example.service.Greeting;

public class SpanishGreeting implements Greeting {
    @Override
    public String sayHello() {
        return "Hola";
    }
}
