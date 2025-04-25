package org.example.LLD.loggingFW.logLevels;

import org.example.LLD.loggingFW.Logger.LogMessage;

public class Debug implements LogLevels {
    @Override
    public void log(LogMessage message) {
        System.out.printf("%s [DEBUG] %s%n",
                message.toString(),
                Thread.currentThread().getName());
    }
    @Override
    public String getLevel() {
        return "DEBUG";
    }
}
