package com.example;
import com.engflow.fancytext.FancyFormatter;

public class Greeting {
    public static void sayHi() {
        String s = "a boring string";
        System.out.println(FancyFormatter.standard().format(s));
    }
}

