public class Main {
    public static void main(String[] args) {
        // Test Text Formatter
        System.out.println("Testing Text Formatter:");
        DocumentEditor editor = new DocumentEditor();
        editor.setText("Hello World");

        editor.setFormatter(new PlainTextFormatter());
        System.out.println("Plain: " + editor.getFormattedText());

        editor.setFormatter(new HtmlFormatter());
        System.out.println("HTML: " + editor.getFormattedText());

        editor.setFormatter(new MarkdownFormatter());
        System.out.println("Markdown: " + editor.getFormattedText());

        // Test Event Logger
        System.out.println("\nTesting Event Logger:");
        EventLogger logger = EventLogger.getInstance();
        logger.log("INFO", "Application started");
        logger.log("DEBUG", "Processing data");
        logger.log("ERROR", "Failed to connect");

        System.out.println("\nLog History:");
        logger.getHistory();

        // Test Notification System
        System.out.println("\nTesting Notification System:");
        NotificationService notifier = new NotificationService();

        notifier.addChannel(new EmailNotification());
        notifier.addChannel(new SMSNotification());
        notifier.addChannel(new SlackNotification());

        notifier.notify("Important message!");
    }
}