package homework.competition;

import homework.competition.base.Obstacle;
import homework.competition.base.Participant;
import homework.competition.obstacle.Racetrack;
import homework.competition.obstacle.Wall;
import homework.competition.participant.Cat;
import homework.competition.participant.Human;
import homework.competition.participant.Robot;


public class Competition_Start {

    public static void competition() {

        Participant[] participants = new Participant[]{
                new Human(1500, 1.7),
                new Cat(750, 2.5),
                new Robot(5000, 4.5),
        };
        Obstacle[] obstacles = new Obstacle[]{
                new Wall(2),
                new Racetrack(1000),
        };

        for (Obstacle o : obstacles) {
            for (Participant p : participants) {
                System.out.println(
                        p.getClass().getSimpleName() + " passed " + o.getClass().getSimpleName()
                                + " result: " + o.overcome(p));
            }
        }

    }
}
