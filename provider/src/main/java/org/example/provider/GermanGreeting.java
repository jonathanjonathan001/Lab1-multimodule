package org.example.provider;

import org.example.service.Greeting;

public class GermanGreeting implements Greeting {
    @Override
    public String sayHello() {
        return "Guten Tag";
    }
}
