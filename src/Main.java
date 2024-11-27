//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();
        editor.setText("Hello World");

        // Test each formatter
        editor.setFormatter(new PlainTextFormatter());
        System.out.println("Plain: " + editor.getFormattedText());

        editor.setFormatter(new HtmlFormatter());
        System.out.println("HTML: " + editor.getFormattedText());

        editor.setFormatter(new MarkdownFormatter());
        System.out.println("Markdown: " + editor.getFormattedText());
    }
}