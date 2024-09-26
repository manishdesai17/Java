import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class SimpleJavaEditor2 extends JFrame {
    private JTextPane textPane;

    public SimpleJavaEditor2() {
        setTitle("Simple Java Editor");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textPane = new JTextPane();
        textPane.setFont(new Font("Monospaced", Font.PLAIN, 12));

        textPane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if (ch == '{') {
                    insertText("{}", -1);
                } else if (ch == '[') {
                    insertText("[]", -1);
                } else if (ch == '(') {
                    insertText("()", -1);
                }
            }
        });

        add(new JScrollPane(textPane));
    }

    private void insertText(String text, int offset) {
        try {
            int caretPos = textPane.getCaretPosition();
            Document doc = textPane.getDocument();
            doc.insertString(caretPos, text, null);
            if (offset != -1) {
                textPane.setCaretPosition(caretPos + offset);
            }
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleJavaEditor2 editor = new SimpleJavaEditor2();
            editor.setVisible(true);
        });
    }
}
