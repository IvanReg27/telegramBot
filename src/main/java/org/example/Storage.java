package org.example;

import java.util.ArrayList;

public class Storage {

    private ArrayList<String> quoteList;
    Storage() {

        quoteList = new ArrayList<>();
        quoteList.add("Привет мои сладенькие хабаровчане, вот я и добралась до Вас");
        quoteList.add("Есть тут смелые мужики, кто хочет сегодня ночью зажечь со мной");
        quoteList.add("Почему молчите...или рядом с вами жены;) тогда намекните мне об этом");
        quoteList.add("Почему молчите...или рядом с вами жены;) тогда намекните мне об этом");
        quoteList.add("Мне кажется Вы перепили грузинское вино, уже не до женщин");
        quoteList.add("Я высокая, спортивная и выносливая в постели, намек понятен мои жеребцы");
        quoteList.add("Почему молчите...или рядом с вами жены;) тогда намекните мне об этом");
    }
    String getRandQuote() {
        int randValue = (int)(Math.random() * quoteList.size());
        return quoteList.get(randValue);
    }
}