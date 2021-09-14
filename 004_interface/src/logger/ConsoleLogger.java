package logger;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {
    @Override
    public void logMessage(Severity severity, EventSource eventSource, String text) {
        final LocalDateTime now = LocalDateTime.now();
        System.out.printf("(%s) %s - %s [%s]: %s\n", now, severity.toString(), eventSource.name, eventSource.aClass.getName(), text);
    }
}
