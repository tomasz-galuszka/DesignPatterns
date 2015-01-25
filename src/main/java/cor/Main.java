package cor;

import cor.loggers.AbstractLogger;
import cor.loggers.ConsoleLogger;
import cor.loggers.ErrorLogger;
import cor.loggers.FileLogger;

public class Main {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.log(AbstractLogger.INFO, "This is an information.");

        loggerChain.log(AbstractLogger.DEBUG, "This is an debug level information.");

        loggerChain.log(AbstractLogger.ERROR, "This is an error information.");
    }
}