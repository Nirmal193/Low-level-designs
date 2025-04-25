package org.example.LLD.loggingFW.Logger;

import org.example.LLD.loggingFW.logLevels.LogLevels;
import org.example.LLD.loggingFW.loggingMedium.LoggingMedium;

public class Configuration {
    private LogLevels logLevel;
    private LoggingMedium loggingMedium;

    public Configuration(LogLevels logLevel, LoggingMedium loggingMedium) {
        this.logLevel = logLevel;
        this.loggingMedium = loggingMedium;
    }

    public LogLevels getLogLevel() {
        return logLevel;
    }

    public LoggingMedium getLoggingMedium() {
        return loggingMedium;
    }
}
