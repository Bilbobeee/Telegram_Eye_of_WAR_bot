package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    final private String BOT_TOKEN = "5900361736:AAEBrf8uYxR1H7WVwnRlYegsAmsw_cFuBZk";
    final private String BOT_NAME = "Eye_of_WAR_bot";

    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public void onUpdateReceived(Update update) {

        Message inMess = update.getMessage();
        String chatId = inMess.getChatId().toString();


        SendMessage outMess = new SendMessage();
        outMess.setChatId(chatId);
        outMess.setText("TEST Mess");
        try {
            execute(outMess);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }

    }


}
