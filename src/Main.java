public class Main {
    public static void main(String[] args) {
        // Test Text Formatter
        DocumentEditor editor = new DocumentEditor();
        editor.setText("Hello World");

        // Test each formatter
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
    }
}