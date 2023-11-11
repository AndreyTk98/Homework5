package homework.competition.obstacle;

import homework.competition.base.Obstacle;
import homework.competition.base.Participant;

public class Racetrack implements Obstacle {

    private final double distance;

    public Racetrack(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.run(distance);
    }
}
