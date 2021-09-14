import alarm.*;
import logger.ConsoleLogger;
import logger.FileLogger;
import logger.Logger;
import safe.Safe;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        Alarm alarm1 = new DogsAlarm();
        alarm1.setLogger(new ConsoleLogger());
        Alarm alarm2 = new PoliceAlarm();

        final Safe safe = new Safe();

        FileLogger fileLogger = null;
        try {
            fileLogger = new FileLogger("log.txt");
            alarm2.setLogger(fileLogger);
            safe.addAlarm(alarm2);
        } catch (IOException e) {
            System.err.println("Cannot open log file for writing");
            e.printStackTrace();
        }

        safe.addAlarm(alarm1);
        safe.setPin("Ala ma kota");

        safe.enterPin("Ala ma kota");

        safe.enterPin("Kot ma Alę");

        if(fileLogger != null) {
            fileLogger.close();
        }
    }

    private static void test2() {
        Alarm alarm1 = new DogsAlarm();
        Alarm alarm2 = new PoliceAlarm();
        Alarm alarm3 = new SoundAlarm();
        Alarm alarm4 = new BarsAlarm();

        final Safe safe = new Safe();

        FileLogger fileLogger = null;
        try {
            fileLogger = new FileLogger("log2.txt");
            alarm2.setLogger(fileLogger);
            alarm4.setLogger(fileLogger);
            safe.addAlarm(alarm2);
            safe.addAlarm(alarm4);
        } catch (IOException e) {
            System.err.println("Cannot open log file for writing");
            e.printStackTrace();
        }

        alarm1.setLogger(new ConsoleLogger());

        safe.addAlarm(alarm1);
        safe.addAlarm(alarm3);

        safe.setPin("Lorem ipsum dolor sit amet");

        safe.enterPin("Litwo, Ojczyzno moja!");

        safe.enterPin("Lorem ipsum dolor sit amet");


        if(fileLogger != null) {
            fileLogger.close();
        }
    }
}
