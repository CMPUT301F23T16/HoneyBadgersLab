package com.example.honeybadgerslab;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        color="blue";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
