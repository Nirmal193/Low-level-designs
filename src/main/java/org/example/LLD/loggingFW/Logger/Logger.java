package org.example.LLD.loggingFW.Logger;

import org.example.LLD.loggingFW.logLevels.LogLevels;
import org.example.LLD.loggingFW.loggingMedium.LoggingMedium;

public class Logger {
   private LoggingMedium loggingMedium;
    private LogLevels logLevel;
    private Configuration configuration;
   // private static final Object lock = new Object();
     Logger(Configuration configuration) {
         if(configuration == null)
             throw new IllegalArgumentException("Configuration cannot be null");
        this.configuration = configuration;
        this.logLevel = configuration.getLogLevel();
        this.loggingMedium = configuration.getLoggingMedium();
    }
    public void log(String message) {
         //synchronized (lock) {
             if (logLevel != null && loggingMedium != null) {
                 LogMessage logMessage = new LogMessage(message);
                 loggingMedium.log(logMessage);
             } else {
                 System.out.println("Logging medium or log level not set.");
             }
       //  }
    }
}
