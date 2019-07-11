import javax.swing.*;

public class MainView {


    public static void main(String[] args) {
        JFrame frame=new JFrame("TODO Storage");
        JPanel pannel = new JPanel();
        JLabel title, title1;
        title=new JLabel("Select data");
        title1= new JLabel("Text field");
        JTextField text, text1;
        text = new JTextField("Select date",16);
        text1 = new JTextField("Select date",16);
        text.setSize(300,300);
        frame.setSize(300,300);
        pannel.add(title);
        pannel.add(text);
        pannel.add(title1);
        pannel.add(text1);
        frame.add(pannel);
//        frame.show();
        frame.setVisible(true);
        frame.setSize(300,300);
//        frame.show();


    }
}
