public class Test {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(8, 10, 6);

        RightTriangle rt = new RightTriangle();
        boolean isRight = rt.isRightTriangle(triangle);

        if (isRight) {
            System.out.println("Trójkąt jest prostokątny");
        } else {
            System.out.println("Trókąt nie jest prostokątny");

        }
    }
}
