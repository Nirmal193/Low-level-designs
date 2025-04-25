package org.example.LLD.loggingFW.loggingMedium;

import org.example.LLD.loggingFW.Logger.LogMessage;
import org.example.LLD.loggingFW.logLevels.LogLevels;

public class DB extends LoggingMedium {
    public DB(LogLevels logLevel) {
        super(logLevel);
    }

    @Override
    protected void initialize() {
        System.out.println("Initializing DB Logging Medium");
    }

    @Override
    public void log(LogMessage message) {
        System.out.println("Logging to database: "+ message);
        logLevel.log(message);
    }
}
