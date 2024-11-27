interface NotificationChannel {
    void send(String message);
}

class EmailNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("EMAIL: " + message);
    }
}

class SMSNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class SlackNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("SLACK: " + message);
    }
}

class NotificationService {
    private java.util.ArrayList<NotificationChannel> channels = new java.util.ArrayList<>();

    public void addChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    public void removeChannel(NotificationChannel channel) {
        channels.remove(channel);
    }

    public void notify(String message) {
        for (NotificationChannel channel : channels) {
            channel.send(message);
        }
    }
}