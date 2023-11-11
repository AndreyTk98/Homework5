package homework.area_of_the_figures.figures;

import homework.area_of_the_figures.base.Area;

public class Round implements Area {

    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI *(radius * radius);
    }
}
