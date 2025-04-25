package org.example.LLD.loggingFW.loggingMedium;

import org.example.LLD.loggingFW.Logger.LogMessage;
import org.example.LLD.loggingFW.logLevels.LogLevels;

public class File extends LoggingMedium {
    public File (LogLevels logLevel) {
        super(logLevel);
    }

    @Override
    protected void initialize() {
        System.out.println("Initializing File Logging Medium");
    }

    @Override
    public void log(LogMessage message) {
        System.out.println("Logging to file: "+ message);
        logLevel.log(message);
    }
}
