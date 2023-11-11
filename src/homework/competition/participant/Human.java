package homework.competition.participant;

import homework.competition.base.Participant;

public class Human implements Participant {

    private final double maxDistance;
    private final double maxHeight;

    public Human(double maxDistance, double maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(double distance) {
        return distance < maxDistance;
    }

    @Override
    public boolean jump(double height) {
        return height < maxHeight;
    }
}
