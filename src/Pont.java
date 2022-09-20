import java.lang.invoke.SwitchPoint;
import java.util.Random;

public class Pont {
    private int x;
    private int y;

    public Pont(){
        this.x = 0;
        this.y = 0;
    }

    public Pont(int x, int y){
        this.x = x;
        this.y = y;
    }

    Random rnd = new Random();
    public Pont(int n){
        this.x = rnd.nextInt(n * 2) - n;
        this.y = rnd.nextInt(n * 2) - n;
    }

    public double getDistanceFromOrigo(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double getDistanceBeetwenPoints(Pont p){
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    public int getQuadron(){

        if(this.x < 0 && this.y > 0){
            return 1;
        }
        else if(this.x < 0 && this.y < 0){
            return 2;
        }
        else if(this.x > 0 && this.y < 0){
            return 3;
        }
        else if(this.x > 0 && this.y > 0){
            return 4;
        }

        return 1;
    }


    public String toString (){
        return("X: " + this.x + " Y: " + this.y);
    }


}
