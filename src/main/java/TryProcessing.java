import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public final int HEIGHT = 750;
    public final int WIDTH = 1000;
    public final int DAIMETER =10;
    int x1=0,x2=0,x3=0,x4=0;
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
    public void draw()
    {
        ellipse(x1,HEIGHT/5,DAIMETER,DAIMETER);
        ellipse(x2,(2*HEIGHT)/5,DAIMETER,DAIMETER);
        ellipse(x3,(3*HEIGHT)/5,DAIMETER,DAIMETER);
        ellipse(x4,(4*HEIGHT)/5,DAIMETER,DAIMETER);
        x1++;
        x2+=2;
        x3+=3;
        x4+=4;
    }
}
