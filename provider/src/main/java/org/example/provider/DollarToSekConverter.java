package org.example.provider;

import org.example.service.CurrencyConverter;

public class DollarToSekConverter implements CurrencyConverter {
    @Override
    public String convert(double amount) {
        return "Your amount in dollars is " + amount + ", converted to SEK: " + amount*10.33;
    }
}
