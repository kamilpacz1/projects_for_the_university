package alarm;

import logger.EventSource;
import logger.Logger;
import logger.Severity;
import safe.PinEvent;

public class BarsAlarm implements Alarm {
    private boolean _isTurnedOn = false;
    Logger logger;

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        if(logger != null) {
            logger.logMessage(Severity.SEVERE, new EventSource("Bars alarm", this.getClass()), "Bars alarm turned on");
        }
        _isTurnedOn = true;
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        if(logger != null) {
            logger.logMessage(Severity.NORMAL, new EventSource("Bars alarm", this.getClass()), "Bars alarm turned off");
        }
        _isTurnedOn = false;
    }

    @Override
    public boolean isTurnedOn() {
        return _isTurnedOn;
    }
}
