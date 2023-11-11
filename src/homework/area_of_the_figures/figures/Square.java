package homework.area_of_the_figures.figures;

import homework.area_of_the_figures.base.Area;

public class Square implements Area {

    private double side;

    @Override
    public double area () {
        return side*side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
