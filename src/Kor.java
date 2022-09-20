import java.util.Random;

public class Kor {
    private Pont p;
    private double r;

    public Kor(int r){
        this.p = new Pont();
        this.r = r;
    }

    public Kor(Pont p, int r){
        this.p = p;
        this.r = r;
    }
    Random rnd = new Random();
    public Kor(){
        this.p = new Pont(10);
        this.r = rnd.nextInt(15);
    }

    public double getCircumference(){
        return 2 * this.r * Math.PI;
    }

    public double getArea(){
        return Math.pow(this.r, 2) * Math.PI;
    }

    public void shrink(int n){
        this.r -= n;
    }

    public void grow(int n){
        this.r += n;
    }

    public String toString (){
        return p + " Sugár: " + r;
    }

}
