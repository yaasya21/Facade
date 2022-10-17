public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.createCircle();
        shapeMaker.createRectangle();
        shapeMaker.createSquare();
    }
}
