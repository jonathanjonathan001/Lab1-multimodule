package org.example.provider;

import org.example.service.CurrencyConverter;

public class SekToDollarConverter implements CurrencyConverter {
    @Override
    public String convert(double amount) {
        return "Your amount in SEK is " + amount + ", converted to dollars: " + amount/10.33;
    }
}
