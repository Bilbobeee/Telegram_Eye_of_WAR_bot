package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {

    final private String BOT_TOKEN = "";
    final private String BOT_NAME = "";

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
