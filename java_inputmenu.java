import javax.swing.JOptionPane;
public class java_inputmenu{
    public static void main(String args[]){
        String name = JOptionPane.showInputDialog("Enter your name: ");
        int bankaccount =  Integer.parseInt(JOptionPane.showInputDialog("Enter bank id: "));
        int money = Integer.parseInt(JOptionPane.showInputDialog("Enter money: "));

        JOptionPane.showMessageDialog(null,"Congrulations " + name + ". You have successfully sent "+ money +  " dollars to "+ bankaccount +" bank account.");
    }
}