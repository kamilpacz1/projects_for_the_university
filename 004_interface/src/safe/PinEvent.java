package safe;

import java.time.LocalDateTime;

public class PinEvent {
    Safe safe;
    LocalDateTime eventDate;
    boolean success;

    public PinEvent(Safe safe, LocalDateTime eventDate, boolean success) {
        this.safe = safe;
        this.eventDate = eventDate;
        this.success = success;
    }

    public Safe getSafe() {
        return safe;
    }
}
