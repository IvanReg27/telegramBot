package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    final private String BOT_TOKEN = "5984975961:AAF7VMK_1bvs3XuNB9dgpHUepToM4KSptKM";
    final private String BOT_NAME = "Natasha2000_bot";

    Storage storage;

    Bot() {
        storage = new Storage();
    }
    public String getBotUsername() {
        return BOT_NAME;
    }
    public String getBotToken() {
        return BOT_TOKEN;
    }
    public void onUpdateReceived(Update update) {
        try {
            if (update.hasMessage() && update.getMessage().hasText()) {
                Message inMess = update.getMessage();
                String chatId = inMess.getChatId().toString();
                String response = parseMessage(inMess.getText());
                SendMessage outMess = new SendMessage();

                outMess.setChatId(chatId);
                outMess.setText(response);

                execute(outMess);
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
            }
        }
        public String parseMessage(String textMsg) {
        String response;

        if(textMsg.equals("/start"))
            response = "Привет, я рассказываю анектод. Всегда пиши только слово 'шутка', и тогда получишь новый анектод";
        else if(textMsg.equals("шутка"))
            //здесь старт ранее прописаной логиги (можно переписать)
            response = storage.getRandQuote();
        else
            response = "Пиши только слово 'анектод'";
        return response;
        }
    }