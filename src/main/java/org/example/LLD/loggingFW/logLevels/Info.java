package org.example.LLD.loggingFW.logLevels;

import org.example.LLD.loggingFW.Logger.LogMessage;

public class Info implements LogLevels {
    @Override
    public void log(LogMessage message) {
        System.out.printf("%s [INFO] %s%n",
                message.toString(),
                Thread.currentThread().getName());
    }

    @Override
    public String getLevel() {
        return "INFO";
    }
}
