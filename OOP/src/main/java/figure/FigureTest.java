package figure;

public class FigureTest {
    public static void main(String[] args) {

        Parallelogram parallelogram = new Parallelogram("Parallelogram", 2);
        Ellipse ellipse = new Ellipse("Ellipse", 2);
        Parallelepiped parallelepiped = new Parallelepiped("Parallelepiped", 3);
        Cylinder cylinder = new Cylinder("Cylinder", 3);

        System.out.println(parallelogram);
        System.out.println(ellipse);
        System.out.println(parallelepiped);
        System.out.println(cylinder);
    }
}
