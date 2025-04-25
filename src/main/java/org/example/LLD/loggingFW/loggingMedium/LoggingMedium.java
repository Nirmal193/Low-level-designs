package org.example.LLD.loggingFW.loggingMedium;

import org.example.LLD.loggingFW.Logger.LogMessage;
import org.example.LLD.loggingFW.logLevels.LogLevels;

public abstract class LoggingMedium {
    protected LogLevels logLevel;
    protected volatile boolean initialized = false;
    public LoggingMedium(LogLevels logLevel) {
        this.logLevel = logLevel;
        this.initialize();
    }
    protected abstract void initialize();
    public abstract void log(LogMessage message);
}
