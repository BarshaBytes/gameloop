import javax.swing.*;

class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("FPS Control Loop");
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        GamePanel game = new GamePanel();
        frame.add(game);
        game.startGame();
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame. setSize(500,500);
        frame.setVisible(true);
    }
}