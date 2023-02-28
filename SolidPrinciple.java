import java.util.Scanner;

interface Shape{
    void setWidth(int width);
    void setHeight(int height);
    int getArea();
}

class Rectangle implements Shape{
    int m_width;
    int m_height;

    public void setWidth(int width){
        m_width = width;
    }

    public void setHeight(int height) {
        m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}
class Square implements Shape {
    int m_width;
    int m_height;
    public void setWidth (int width) {
        m_width = width;
    }

    public void setHeight (int height) {
        m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }
    public int getArea() {
        return m_width * m_height;
    }
}
public class SolidPrinciple
{
    public static void main(String args[]) {
        int width, height;

        //Object of Rectangle and square class created, their dimensions are set using setWidth and setHeight methods, area calculated using calculateArea and printed on console.
        Rectangle rectangleOne = new Rectangle();
        Square squareOne = new Square();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of rectangle: ");
        width = input.nextInt();
        System.out.println("Enter the Height of rectangle: ");
        height = input.nextInt();
        rectangleOne.setWidth(width);
        rectangleOne.setHeight(height);
        
        int rectangle_width = rectangleOne.getWidth();
        int rectangle_height = rectangleOne.getHeight();
        
        System.out.println("width of rectangle = " + rectangle_width);
        System.out.println("height of rectangle = " + rectangle_height);
        int rectangleArea = rectangleOne.getArea();
        System.out.println("area of rectangle is" + rectangleArea);

        System.out.println("Enter the width of square: ");
        width = input.nextInt();
        System.out.println("Enter the Height of square: ");
        height = input.nextInt();
        squareOne.setWidth(width);
        squareOne.setHeight(height);
        
        int square_width = squareOne.getWidth();
        int square_height = squareOne.getHeight();
        
        System.out.println("width of square: " + square_width);
        System.out.println("height of square: " + square_height);
        
        int squareArea = squareOne.getArea();
        System.out.println("area of rectangle: " + squareArea);
    }
}
