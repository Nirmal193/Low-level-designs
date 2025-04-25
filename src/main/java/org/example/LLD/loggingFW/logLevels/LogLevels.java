package org.example.LLD.loggingFW.logLevels;

import org.example.LLD.loggingFW.Logger.LogMessage;

public interface LogLevels {
    void log(LogMessage message);
    String getLevel();
}
