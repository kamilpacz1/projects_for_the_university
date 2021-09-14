package logger;

public enum Severity {
    SEVERE {
        @Override
        public String toString() {
            return "severe";
        }
    },
    NORMAL {
        @Override
        public String toString() {
            return "normal";
        }
    }
}
