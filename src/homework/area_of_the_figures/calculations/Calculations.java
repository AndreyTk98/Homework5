package homework.area_of_the_figures.calculations;

import homework.area_of_the_figures.base.Area;
import homework.area_of_the_figures.figures.Round;
import homework.area_of_the_figures.figures.Square;
import homework.area_of_the_figures.figures.Triangle;

public class Calculations {

    public static void figuresArea () {
        Area[] areas = new Area[] {
                new Square(15),
                new Round(12),
                new Triangle(5, 10)
        };
        for (Area i : areas) {
            System.out.println(i.getClass().getSimpleName() + ": " + i.area());
        }
    }
}
