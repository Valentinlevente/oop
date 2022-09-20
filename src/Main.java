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

        //-------------- Korok --------------//

        Kor k1 = new Kor(5);
        System.out.println(k1);
        System.out.println(k1.getCircumference());
        System.out.println(k1.getArea());
        k1.grow(6);
        System.out.println(k1);
        k1.shrink(4);
        System.out.println(k1);
        System.out.println();

        Kor[] korok = new Kor[10];
        for (int i = 0; i < korok.length; i++){
            korok[i] = new Kor();
            System.out.println(korok[i]);

        }
        int indexOfLargestArea = 0;
        double max = 0;
        for (int i = 0; i < korok.length; i++){
            if(korok[i].getArea() > max){
                max = korok[i].getArea();
                indexOfLargestArea = i + 1;
            }
        }
        System.out.println("A kör a legnagyobb területtel a " + indexOfLargestArea + ".-ik " + max + "-al.");




        //-------------- Korok --------------//

    }
}