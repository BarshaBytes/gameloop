import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable{
    int x =0;
    int y =0;
     Thread thread;
     GamePanel() {
        super();
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.BLACK);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
         g.setColor(Color.CYAN);
         g.fillRect(x,y,100,100);
    }

   
    public void startGame(){
        thread = new Thread(this);
    thread.start();
    }
    public void update(){

    }
    @Override
    public void run() {
        double drawInterval = 1000000000/60;
        double deltaTime =0;
        long lastPassedTime = System.nanoTime();
        long currentTime =0;

        while(thread != null){

            currentTime= System.nanoTime();
            deltaTime+=(currentTime - lastPassedTime)/drawInterval;
            lastPassedTime= currentTime;

            if(deltaTime >=1){
                x= x + 5;
                repaint();
                deltaTime--;
            }



       
        /*long time = System.nanoTime();
        System.out.println("Game Loop"+ time);
        x=x+1; */
    }
        
    }
}

    

