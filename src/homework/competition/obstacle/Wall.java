package homework.competition.obstacle;

import homework.competition.base.Obstacle;
import homework.competition.base.Participant;

public class Wall implements Obstacle {
    private final double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(height);
    }
}
