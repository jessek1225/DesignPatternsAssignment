class LogEntry {
    private String timestamp;
    private String level;
    private String message;

    public LogEntry(String level, String message) {
        this.timestamp = java.time.LocalDateTime.now().toString();
        this.level = level;
        this.message = message;
    }

    public String toString() {
        return timestamp + " [" + level + "] " + message;
    }
}

class EventLogger {
    private static EventLogger instance;
    private java.util.ArrayList<LogEntry> logs;

    private EventLogger() {
        logs = new java.util.ArrayList<>();
    }

    public static EventLogger getInstance() {
        if (instance == null) {
            instance = new EventLogger();
        }
        return instance;
    }

    public void log(String level, String message) {
        LogEntry entry = new LogEntry(level, message);
        logs.add(entry);
        System.out.println(entry);
    }

    public void getHistory() {
        for (LogEntry entry : logs) {
            System.out.println(entry);
        }
    }
}