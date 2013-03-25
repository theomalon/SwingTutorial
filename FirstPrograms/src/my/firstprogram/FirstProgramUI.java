//Chris Malon
package my.firstprogram;
    
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.SwingUtilities;

public class FirstProgramUI extends JFrame{
    
    public FirstProgramUI(){
       setTitle("Simple example");
       setSize(300, 200);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FirstProgramUI ex = new FirstProgramUI();
                ex.setVisible(true);
            }
        });
    }
}
   
