import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Simple_Java_Editor {
    private static final List<String> JAVA_KEYWORDS = Arrays.asList(
        "abstract", "assert", "boolean", "break", "byte", "case", "catch", 
        "char", "class", "const", "continue", "default", "do", "double", 
        "else", "enum", "extends", "final", "finally", "float", "for", 
        "if", "goto", "implements", "import", "instanceof", "int", "interface", 
        "long", "native", "new", "null", "package", "private", "protected", 
        "public", "return", "short", "static", "strictfp", "super", "switch", 
        "synchronized", "this", "throw", "throws", "transient", "try", 
        "void", "volatile", "while"
    );

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Simple_Java_Editor::createUI);
    }

    private static void createUI() {
        JFrame frame = new JFrame("Simple Java Code Editor");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextPane textPane = new JTextPane();
        textPane.setContentType("text/java");
        textPane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if (ch == '(' || ch == '{' || ch == '[') {
                    textPane.insertComponent(new JLabel(String.valueOf(ch)));
                    textPane.insertComponent(new JLabel(getClosingCharacter(ch)));
                    textPane.setCaretPosition(textPane.getCaretPosition() - 1);
                    e.consume();
                }
                highlightKeywords(textPane);
            }
        });

        JScrollPane scrollPane = new JScrollPane(textPane);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static char getClosingCharacter(char ch) {
        switch (ch) {
            case '(': return ')';
            case '{': return '}';
            case '[': return ']';
            default: return ch;
        }
    }

    private static void highlightKeywords(JTextPane textPane) {
        String text = textPane.getText();
        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet keywordAttr = new SimpleAttributeSet();
        StyleConstants.setForeground(keywordAttr, Color.BLUE);

        // Reset styles
        doc.setCharacterAttributes(0, text.length(), new SimpleAttributeSet(), true);

        for (String keyword : JAVA_KEYWORDS) {
            int index = text.indexOf(keyword);
            while (index >= 0) {
                doc.setCharacterAttributes(index, keyword.length(), keywordAttr, false);
                index = text.indexOf(keyword, index + 1);
            }
        }
    }
}

