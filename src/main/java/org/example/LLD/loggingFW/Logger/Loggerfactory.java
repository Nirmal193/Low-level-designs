package org.example.LLD.loggingFW.Logger;

public class Loggerfactory {
    private static Logger logger;
    public static synchronized Logger getLogger(Configuration configuration){
        if (logger == null) {
            logger = new Logger(configuration);
        }
        return logger;
    }
}
