import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your Name:");
        JOptionPane.showMessageDialog(null,"hello "+ name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age: "));
        JOptionPane.showMessageDialog(null,age);
    }    
}
