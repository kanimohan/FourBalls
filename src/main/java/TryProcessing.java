import processing.core.PApplet;
public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 100;
    public static final int DIAMETER = 20;
    int w,x,y,z=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT*5);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(w,HEIGHT, DIAMETER,DIAMETER);
        w++;
        ellipse(x,HEIGHT*2, DIAMETER,DIAMETER);
        x+=2;
        ellipse(y,HEIGHT*3, DIAMETER,DIAMETER);
        y+=3;
        ellipse(z,HEIGHT*4, DIAMETER,DIAMETER);
        z+=4;
    }

}
