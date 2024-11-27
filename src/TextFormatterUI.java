import javax.swing.*;
import java.awt.*;

public class TextFormatterUI {
    private JFrame frame;
    private JTextArea textArea;
    private DocumentEditor editor;

    public TextFormatterUI() {
        editor = new DocumentEditor();
        createWindow();
    }

    private void createWindow() {
        frame = new JFrame("Text Formatter");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Create buttons
        JPanel buttons = new JPanel();
        addFormatButton(buttons, "Plain Text", new PlainTextFormatter());
        addFormatButton(buttons, "HTML", new HtmlFormatter());
        addFormatButton(buttons, "Markdown", new MarkdownFormatter());
        frame.add(buttons, BorderLayout.SOUTH);
    }

    private void addFormatButton(JPanel panel, String name, TextFormatter formatter) {
        JButton button = new JButton(name);
        button.addActionListener(e -> {
            editor.setText(textArea.getText());
            editor.setFormatter(formatter);
            JOptionPane.showMessageDialog(frame, editor.getFormattedText(),
                    name + " Format", JOptionPane.INFORMATION_MESSAGE);
        });
        panel.add(button);
    }

    public void show() {
        frame.setVisible(true);
    }
}