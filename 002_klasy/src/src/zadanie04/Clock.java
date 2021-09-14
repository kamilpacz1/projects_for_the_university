package zadanie04;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        hours = 12;
        minutes = 0;
        seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Clock(int secondsFromMidnight) {
        final int h = secondsFromMidnight / 3600;
        this.hours = h;
        secondsFromMidnight -= h * 3600;
        final int m = secondsFromMidnight / 60;
        this.minutes = m;
        secondsFromMidnight -= m * 60;
        seconds = secondsFromMidnight;
    }

    public void tick() {
        seconds++;
        if(seconds > 59) {
            seconds = 0;
            minutes++;
            if(minutes > 59) {
                minutes = 0;
                hours++;
                if(hours > 23) {
                    hours = 0;
                }
            }
        }
    }

    public void tickDown() {
        seconds--;
        if(seconds < 0) {
            minutes--;
            seconds = 59;
            if(minutes < 0) {
                hours--;
                if(hours < 0) {
                    hours = 23;
                    minutes = 59;
                }
            }
        }
    }

    public void setHours(int hours) {
        if(hours < 0 || hours > 23) {
            System.out.println("Niewłaściwa wartość godzin: " + hours);
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if(minutes < 0 || minutes > 59) {
            System.out.println("Niewłaściwa wartość minut: " + minutes);
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if(seconds < 0 || seconds > 59) {
            System.out.println("Niewłaściwa wartość sekund: " + seconds);
        } else {
            this.seconds = seconds;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        String out = "[";
        if(hours < 10) {
            out += "0";
        }
        out += hours + ":";

        if(minutes < 10) {
            out += "0";
        }
        out += minutes + ":";

        if(seconds < 10) {
            out += "0";
        }
        out += seconds + "]";

        return out;
    }
}
