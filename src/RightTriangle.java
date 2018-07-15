public class RightTriangle {

    public boolean isRightTriangle(Triangle triangle) {

        return ((triangle.getA() * triangle.getA()) + (triangle.getB() * triangle.getB()) == triangle.getC() * triangle.getC());

    }
}

