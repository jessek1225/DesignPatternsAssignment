interface TextFormatter {
    String format(String text);
}

class PlainTextFormatter implements TextFormatter {
    public String format(String text) {
        return text;
    }
}

class HtmlFormatter implements TextFormatter {
    public String format(String text) {
        return "<html>" + text + "</html>";
    }
}

class MarkdownFormatter implements TextFormatter {
    public String format(String text) {
        return "# " + text;
    }
}

class DocumentEditor {
    private TextFormatter formatter = new PlainTextFormatter();
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public String getFormattedText() {
        return formatter.format(text);
    }
}