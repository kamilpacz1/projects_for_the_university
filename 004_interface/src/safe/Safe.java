package safe;

import alarm.Alarm;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Safe {
    List<Alarm> alarms = new ArrayList<>();
    String pin;

    public void addAlarm(Alarm alarm) {
        this.alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        this.alarms.remove(alarm);
    }

    public void enterPin(String pin) {
        if(pin.equals(this.pin)) {
            correctPin();
        } else {
            wrongPin();
        }
    }

    public void wrongPin() {
        System.out.println("Wrong pin");
        for (Alarm alarm : alarms) {
            alarm.alarmTurnOn(new PinEvent(this, LocalDateTime.now(), false));
        }
    }

    public void correctPin() {
        System.out.println("Correct pin. Safe is open.");
        for (Alarm alarm : alarms) {
            if(alarm.isTurnedOn()) {
                alarm.alarmTurnOff(new PinEvent(this, LocalDateTime.now(), true));
            }
        }
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
