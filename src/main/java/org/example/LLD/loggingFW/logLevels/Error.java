package org.example.LLD.loggingFW.logLevels;

import org.example.LLD.loggingFW.Logger.LogMessage;

public class Error implements LogLevels {
    @Override
    public void log(LogMessage message) {
        System.out.printf("%s [ERROR] %s%n",
                message.toString(),
                Thread.currentThread().getName());
    }
    @Override
    public String getLevel() {
        return "ERROR";
    }
}
