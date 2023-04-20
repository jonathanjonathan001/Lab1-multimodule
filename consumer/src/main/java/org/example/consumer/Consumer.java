package org.example.consumer;


import org.example.service.CurrencyConverter;
import org.example.service.Greeting;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Consumer {
    public static void main(String[] args)  {

        ServiceLoader<Greeting> greetings = ServiceLoader.load(Greeting.class);

        ServiceLoader<CurrencyConverter> converters = ServiceLoader.load(CurrencyConverter.class);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount you wish to convert:");

        boolean success = false;
        double amount = 0;
        while (!success) {
            try {
                amount = Double.parseDouble(scanner.nextLine());
                success = true;
            } catch (Exception e) {
                System.out.println("Incorrect number, please try again!");
            }
        }

        for (var converter : converters) {
            System.out.println(converter.convert(amount));
        }


    }

}
