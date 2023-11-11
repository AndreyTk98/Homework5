package homework.area_of_the_figures.figures;

import homework.area_of_the_figures.base.Area;

public class Triangle implements Area {

    private double baseLength;
    private double heightLength;

    @Override
    public double area() {
        return 0.5 * baseLength * heightLength;
    }

    public Triangle(double baseLength, double heightLength) {
        this.baseLength = baseLength;
        this.heightLength = heightLength;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeightLength() {
        return heightLength;
    }

    public void setHeightLength(double heightLength) {
        this.heightLength = heightLength;
    }
}
