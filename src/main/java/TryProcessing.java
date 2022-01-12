import processing.core.PApplet;
import java.util.ArrayList;

public class TryProcessing extends PApplet {
    private final int HEIGHT = 750;
    private final int WIDTH = 1000;
    private ArrayList<Ball> balls;
    public static void main(String args[])
    {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        balls=new ArrayList<>();
        balls.add(new Ball(0,HEIGHT/5,10,1));
        balls.add(new Ball(0,(2*HEIGHT)/5,10,2));
        balls.add(new Ball(0,(3*HEIGHT)/5,10,3));
        balls.add(new Ball(0,(4*HEIGHT)/5,10,4));
    }

    @Override
    public void draw()
    {
        drawBalls();
    }
    private void drawBalls()
    {
        for(int iterator=0;iterator<balls.size();iterator++)
        {
            Ball currentBall=balls.get(iterator);
            drawEllipse(currentBall);
            int currentSpeedRate=currentBall.getSpeedRate();
            incrementX(currentBall,currentSpeedRate);
        }
    }
    private void incrementX(Ball currentBall,int currentSpeedRate) {
        currentBall.setxCordinate(currentBall.getxCordinate()+currentSpeedRate);
    }

    private void drawEllipse(Ball currentBall) {
        ellipse(currentBall.getxCordinate(),currentBall.getyCordinate(),currentBall.getDaimeter(),currentBall.getDaimeter());
    }
}
