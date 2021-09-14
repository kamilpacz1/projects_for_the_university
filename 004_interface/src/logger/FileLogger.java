package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class FileLogger implements Logger {
    private final PrintWriter out;

    public FileLogger(String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        out = new PrintWriter(fileWriter);
    }

    @Override
    public void logMessage(Severity severity, EventSource eventSource, String text) {
        final LocalDateTime now = LocalDateTime.now();
        final String str = String.format("(%s) %s - %s [%s]: %s\n", now, severity.toString(), eventSource.name, eventSource.aClass.getName(), text);
        out.print(str);
    }

    public void close() {
        out.close();
    }
}
