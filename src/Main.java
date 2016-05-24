import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class Main extends JPanel implements MouseListener { // A basic Simon says game.

    //Positioning variables
    //Button 1
    int b1x = 50;
    int b1y = 25;
    int b1w = 200;
    int b1h = 200;

    //Button 2
    int b2x = 300;
    int b2y = 25;
    int b2w = 200;
    int b2h = 200;

    //Button 3
    int b3x = 50;
    int b3y = 275;
    int b3w = 200;
    int b3h = 200;

    //Button 4
    int b4x = 300;
    int b4y = 275;
    int b4w = 200;
    int b4h = 200;

    //Frame stats
    int frameWidth = 550;
    int frameHeight = 525;

    //Mouse stats
    int mouseX;
    int mouseY;

    //Gamestate
    boolean running = true;
    Random rand = new Random();
    boolean b1 = false;
    boolean b2 = false;
    boolean b3 = false;
    boolean b4 = false;

    Timer timer;

    int numOfCorrect = 1;

    int[] algorithom = new int[900000];
    int[] chosenElem = new int[900000];
    //
    //Music music = new Music();

    public static void main(String[] args) {
        Main main = new Main();
        main.createWindow();
        main.gameTimer();
        main.lastRun();
    }

    public void createWindow() {
        Main main = new Main();

        JFrame frame = new JFrame("Simon");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(frameWidth,frameHeight);
        frame.setLocationRelativeTo(null);
        frame.addMouseListener(main);
        frame.add(main);
    }

    public void customUpdate() {
        Music music = new Music();
        int temp = 0;
        int x = 0;
        algorithom[x] = 1;
        if(b1){
            temp = 1;
            music.playMP3("C:/Users/hb015507/IdeaProjects/Simon/src/Resources/Bomb-SoundBible.com-891110113.wav");
        }
        if(b2){
            temp = 2;
            music.playMP3("C:/Users/hb015507/IdeaProjects/Simon/src/Resources/Gun_Shot-Marvin-1140816320.wav");
        }
        if(b3){
            temp = 3;
            music.playMP3("C:/Users/hb015507/IdeaProjects/Simon/src/Resources/50_sniper_shot-Liam-2028603980.wav");

        }
        if(b4){
            temp = 4;
            music.playMP3("C:/Users/hb015507/IdeaProjects/Simon/src/Resources/Gun_loud-Soundmaster_-88363983.wav");

        }
        if(algorithom[x] == temp){
            System.out.println("nice ok");
        }
    }

    public void lastRun() {
        b1 = false;
        b2 = false;
        b3 = false;
        b4 = false;
    }

    public int colorPicker() {
        int color = rand.nextInt(4);
        System.out.println(color);

        return color;
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(b1x,b1y,b1w,b1h);

        g.setColor(Color.RED);
        g.fillRect(b2x,b2y,b2w,b2h);

        g.setColor(Color.YELLOW);
        g.fillRect(b3x,b3y,b3w,b3h);

        g.setColor(Color.CYAN);
        g.fillRect(b4x, b4y, b4w, b4h);
    }

    //Following Methods are required by implementation
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
//        System.out.println(e);
        mouseX = e.getX();
        mouseY = e.getY();
        b1 = BoxChecker(mouseX, mouseY, b1x, b1y, b1w, b1h);
        b2 = BoxChecker(mouseX, mouseY, b2x, b2y, b2w, b2h);
        b3 = BoxChecker(mouseX, mouseY, b3x, b3y, b3w, b3h);
        b4 = BoxChecker(mouseX, mouseY, b4x, b4y, b4w, b4h);
        customUpdate();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public boolean BoxChecker(int x, int y, int BoxX, int BoxY, int BoxLen, int BoxHeight){
        if((BoxX <= x && x <= (BoxX + BoxLen)) && (BoxY + 20 <= y && y <= (BoxY + BoxHeight) + 20)){
            System.out.println("You Clicked me!");
            return true;
        }
        return false;
    }
    public void gameTimer(){
        timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //customUpdate(numOfCorrect);
            }
        });
        timer.start();
    }
}