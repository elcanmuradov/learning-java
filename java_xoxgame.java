
import javax.swing.JOptionPane;


public class java_xoxgame {

    public static void print_table(String[][] table) {
        System.out.print("\n\n");
        System.out.println(table[0][0] + "|" + table[0][1] + "|" + table[0][2]);
        System.out.println("-----------");
        System.out.println(table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
        System.out.println("-----------");
        System.out.println(table[2][0] + "|" + table[2][1] + "|" + table[2][2]);
        System.out.print("\n\n");
        System.out.println("-----------------------------");
    }

    public static boolean checkLine(String a, String b, String c) {
        return (!a.equals("   ") && a.equals(b) && b.equals(c));
    }
    public static boolean isFinish(String[][] table){
        for (int i = 0; i < 3; i++) {
                if (checkLine(table[i][0], table[i][1], table[i][2]) || checkLine(table[0][i], table[1][i], table[2][i]) || checkLine(table[0][0], table[1][1], table[2][2]) || checkLine(table[0][2], table[1][1], table[2][0])) {
                    return true;
                }
            }
            return false;
    }
    public static int isDraw(String[][] table){
        int i = 0;
        for (int k = 0; k < 3 ; k++){
                for (int x = 0; x < 3 ; x++){
                    if (!table[k][x].equals("   "))
                    i++;
                }
    }
    return i;
}
    public static void play_game(String[][] table, String[] players) {
        int j = 0;
        int column, row;
        while (true) {
            String[] choiches = {" X ", " O "};
            do {
            column = Integer.parseInt(JOptionPane.showInputDialog(players[j % 2] + " choose the column (1, 2, 3):"));
            row = Integer.parseInt(JOptionPane.showInputDialog(players[j % 2] + " choose the row(1, 2, 3):"));
            if (!table[column - 1][row - 1].equals("   ")){
                JOptionPane.showMessageDialog(null, players[j%2] + " the place you chose is full! Please try again.");
            }
            }while(!table[column - 1][row - 1].equals("   "));

            table[column - 1][row - 1] = choiches[j % 2];
            print_table(table);

            if (isFinish(table) == true){
                JOptionPane.showMessageDialog(null,"Congrulations " + players[j%2] + " ! You won!!" );
                break;
            }
            if (isDraw(table) == 9){
                 JOptionPane.showMessageDialog(null,"The game ended in a draw! Please start again." );
            }
            j++;
            }
        }

    public static void main(String args[]) {
        String[][] table = {{"   ", "   ", "   "}, {"   ", "   ", "   "}, {"   ", "   ", "   "}};
        String name1 = JOptionPane.showInputDialog("Enter first player name:");
        String name2 = JOptionPane.showInputDialog("Enter second play name:");
        String[] players = {name1, name2};
        play_game(table, players);
    }
}
