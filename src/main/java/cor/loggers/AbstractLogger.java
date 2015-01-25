package cor.loggers;

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    abstract protected void write(String message);

    public void setNextLogger(AbstractLogger logger) {
        this.nextLogger = logger;
    }

    public void log(int level, String message) {
        if (this.level <= level) {
            this.write(message);
        }
        if (nextLogger != null) {
            nextLogger.log(level, message);
        }
    }

}
