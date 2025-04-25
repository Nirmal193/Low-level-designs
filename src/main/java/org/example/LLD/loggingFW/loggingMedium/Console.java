package org.example.LLD.loggingFW.loggingMedium;

import org.example.LLD.loggingFW.Logger.LogMessage;
import org.example.LLD.loggingFW.logLevels.LogLevels;

public class Console extends LoggingMedium {
    public Console(LogLevels logLevel) {
        super(logLevel);
    }

    @Override
    protected void initialize() {
        System.out.println("Initializing Console Logging Medium");
    }

    @Override
    public void log(LogMessage message) {
        System.out.println("Logging to console: "+ message);
        logLevel.log(message);
    }
}
