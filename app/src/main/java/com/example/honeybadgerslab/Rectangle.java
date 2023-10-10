
package com.example.honeybadgerslab;
public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(int x, int y, int length, int width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    public int getLength() {return length;}

    public void setLength(int length) {this.length = length;}

    public int getWidth() {return width;}

    public void setWidth(int width) {this.width = width;}

    public double calculateArea() {
        return length*width;
    }

    public double calculateCircumference() {
        return 2 * (length + width);
    }
}
