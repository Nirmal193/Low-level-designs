package org.example.LLD.loggingFW.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogMessage {
    private final String content;
    private final LocalDateTime timestamp;

    public LogMessage(String content) {
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format("[%s] %s",
                timestamp.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                content);
    }
}
