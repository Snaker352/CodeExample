package alone.main;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import alone.utils.*;

public class Game {

    private final String WINDOW_TITLE = "Alone?";

    private int winWidth = 1600;
    private int winHeight = 900;

    private double tps = 60;
    private boolean running;

    public int tickCount;
    public int frameCount;
    public long timer;

    private JFrame frame;
    private DrawPanel draw;

    // TODO: Maybe make engine public
    private static Engine engine;
    public static Display display;

    public Game() {

        // Creates the engine and display
        engine = new Engine();
        display = new Display(winWidth, winHeight);

        // Initiates and starts the game
        init();
    }

    public void init() {

        // Sets the game to running
        running = true;
        
        //Creates a window and a panel inside
        frame = new JFrame(WINDOW_TITLE);
        draw = new DrawPanel();
        frame.getContentPane().add(draw);

        // Edits the preferances of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // TODO: Might want to save data before immediately closing
        frame.setSize(winWidth, winHeight);

        // Adds listeners to the window
        frame.addKeyListener(new KeyManager());
        frame.addMouseListener(new MouseManager());
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                display.setSize(frame.getWidth(), frame.getHeight());
            }
            @Override
            public void componentMoved(ComponentEvent e) {
                //
            }
        });

        // Shows the window
        frame.setVisible(true);

        // TODO: Make something to load saved data (to continue a game)
        
        // Begins the game loop
        run();
    }

    public void run() {

        timer = System.currentTimeMillis();
        long prevTime = System.nanoTime();
        long currTime;

        double delta = 0;

        int ticks = 0;
        int frames = 0;

        while (running) {

            // Sets new current time
            currTime = System.nanoTime();
            delta += (currTime - prevTime) / (1000000000 / tps);
            prevTime = currTime;
            
            // Runs ticks
            if (delta >= 1) {
                engine.tick();
                ticks++;
                delta--;
            }

            // Draws the screen
            draw.repaint();
            frames++;

            // Edits the data variables
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;

                tickCount = ticks;
                ticks = 0;

                frameCount = frames;
                frames = 0;
            }
        }

        // TODO: When it stops running, save data
    }

    class DrawPanel extends JPanel {

        // No idea what this does, but it keeps away an error
        static final long serialVersionUID = 42L;

        // Sets the window to display the wanted image
        public void paintComponent(Graphics gfx) {

            // Loads the screen image
            display.loadScreen();

            // Displays the screen image
            gfx.drawImage(display.getScreen(), 0, 0, null);
        }
    }
}