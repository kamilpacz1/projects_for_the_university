package logger;

public interface Logger {
    Severity severity = null;
    void logMessage(Severity severity, EventSource eventSource, String text);
}
