package DesignPattern.Facade;

public class shapeMaker {
    private shape triangle;
    private shape rectangle;
    private shape square;

    public shapeMaker(){
        triangle=new Triangle();
        rectangle=new Rectangle();
        square=new Square();
    }

    public void drawTriangle(){
        triangle.draw();
    }


    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
