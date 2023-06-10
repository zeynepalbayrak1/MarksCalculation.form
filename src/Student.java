import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtStName;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAverage;
    private JTextField txtGrade;
    private JButton calculateButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int m1, m2, m3, total;
            double average;

            m1 = Integer.parseInt(txtMarks1.getText());
            m2 = Integer.parseInt(txtMarks2.getText());
            m3 = Integer.parseInt(txtMarks3.getText());

            total = m1 + m2 + m3;
            txtTotal.setText(String.valueOf(total));

            average = (m1 + m2 + m3)/3;

            txtAverage.setText(String.valueOf(average));

            if(average>50) {
                txtGrade.setText("Pass");
            } else {
                txtGrade.setText("Fail");
            }


        }
    });
}
}
