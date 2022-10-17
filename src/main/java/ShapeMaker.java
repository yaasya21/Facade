public class ShapeMaker {
    public ShapeMaker() {}

    public void createCircle() {
        Shape circle = new Circle();
        circle.drawNewFigure();
    }

    public void createRectangle() {
        Shape rectangle = new Rectangle();
        rectangle.drawNewFigure();
    }

    public void createSquare() {
        Shape square = new Square();
        square.drawNewFigure();
    }
}
