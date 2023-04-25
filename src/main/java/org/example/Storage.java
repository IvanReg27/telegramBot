package org.example;

import java.util.ArrayList;

public class Storage {

    private ArrayList<String> quoteList;
    Storage() {

        quoteList = new ArrayList<>();
        quoteList.add("Привет мои сладенькие абаровчане, вот я и добралась до вашего чата");
        quoteList.add("Есть тут смелые мужики, кто хочет сегодня ночью зажечь со мной");
        quoteList.add("Почему молчите...или рядом с вами жены;) тогда намекни мне об этом");
    }
    String getRandQuote() {
        int randValue = (int)(Math.random() * quoteList.size());
        return quoteList.get(randValue);
    }
}