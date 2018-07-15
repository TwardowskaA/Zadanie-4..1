public class Test {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(10, 8, 6);

        boolean isRightTriangle = ((triangle.getA() * triangle.getA()) + (triangle.getB() * triangle.getB()) == triangle.getC() * triangle.getC());
        boolean isRightTriangle1 = ((triangle.getB() * triangle.getB()) + (triangle.getC() * triangle.getC()) == triangle.getA() * triangle.getA());
        boolean isRightTriangle2 = ((triangle.getA() * triangle.getA()) + (triangle.getC() * triangle.getC()) == triangle.getB() * triangle.getB());

        if (isRightTriangle) {
            System.out.println("Trójkąt jest prostokątny");
        }
        else if (isRightTriangle1) {
            System.out.println("Trójkąt jest prostokątny");
        }
        else if (isRightTriangle2) {
            System.out.println("Trójkąt jest prostokątny");
        } else {
            System.out.println("Trójkąt nie jest prostokątny");
        }

    }
}


