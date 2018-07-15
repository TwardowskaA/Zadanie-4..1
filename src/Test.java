public class Test {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(6, 8, 10);

        boolean isRightTriangle = ((triangle.getA() * triangle.getA()) + (triangle.getB() * triangle.getB()) == triangle.getC() * triangle.getC());


        if (isRightTriangle) {
            System.out.println("Trójkąt jest prosotkątny");
        } else {
            System.out.println("Trójkąt nie jest prostokątny");
        }
    }
}

