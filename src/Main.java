public class Main {
    public static void main(String[] args) {

        //-------------- Pontok -------------//
        Pont p1 = new Pont();
        System.out.println(p1);

        Pont p2 = new Pont(4,6);
        System.out.println(p2);

        Pont p3 = new Pont(10);
        System.out.println(p3);
        System.out.println(p3.getDistanceFromOrigo());

        Pont p4 = new Pont(8);
        Pont p5 = new Pont(8);
        System.out.println(p4.getDistanceBeetwenPoints(p5));

        Pont p6 = new Pont(12);
        System.out.println(p6);
        //-------------- Pontok -------------//

    }
}