package alarm;

import logger.Logger;
import safe.PinEvent;

public interface Alarm {
    Logger logger = null;

    void alarmTurnOn(PinEvent pinEvent);
    void alarmTurnOff(PinEvent pinEvent);
    boolean isTurnedOn();
    void setLogger(Logger logger);
}
