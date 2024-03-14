import java.awt.Frame;
import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testAWT {
    public static void main(String[] args) {
        // Create and configure the frame
        Frame frame = new Frame("AWT program for MSME");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Create a button
        Button button = new Button("Click Me");
        button.setBounds(150, 100, 100, 40);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Print some details to the console
                System.out.println("Details:");
                System.out.println("Java version: " + System.getProperty("java.version"));
                System.out.println("Operating System: " + System.getProperty("os.name"));
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Add a window listener to handle closing the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Terminate the program when the window is closed
            }
        });

        // Make the frame visible
        frame.setLayout(null); // Disable layout manager to specify the button position manually
        frame.setVisible(true);
    }
}