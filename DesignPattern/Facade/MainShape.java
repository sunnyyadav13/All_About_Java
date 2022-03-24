package DesignPattern.Facade;

public class MainShape {
    public static void main(String[] args) {
        shapeMaker obj=new shapeMaker();
        obj.drawTriangle();
        obj.drawRectangle();
        obj.drawSquare();
    }


}
