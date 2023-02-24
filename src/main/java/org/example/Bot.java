package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {

    final private String BOT_TOKEN = "5900361736:AAEBrf8uYxR1H7WVwnRlYegsAmsw_cFuBZk";
    final private String BOT_NAME = "Eye_of_WAR_bot";

    public String getBOT_TOKEN() {
        return BOT_TOKEN;
    }

    public String getBOT_NAME() {
        return BOT_NAME;
    }

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return null;
    }
}
