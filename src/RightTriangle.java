public class RightTriangle {

    public boolean isRightTriangle(Triangle triangle) {

        boolean isRightTriangle = ((triangle.getA() * triangle.getA()) + (triangle.getB() * triangle.getB()) == triangle.getC() * triangle.getC());
        boolean isRightTriangle1 = ((triangle.getB() * triangle.getB()) + (triangle.getC() * triangle.getC()) == triangle.getA() * triangle.getA());
        boolean isRightTriangle2 = ((triangle.getA() * triangle.getA()) + (triangle.getC() * triangle.getC()) == triangle.getB() * triangle.getB());


        if (isRightTriangle) {
            System.out.println("Trójkąt jest prostokątny");

        } else if (isRightTriangle1) {
            System.out.println("Trójkąt jest prostokątny");

        } else if (isRightTriangle2) {
            System.out.println("Trójkąt jest prostokątny");

        } else {
            System.out.println("Trókąt nie jest prostokątny");

        }

        return isRightTriangle;
    }
}