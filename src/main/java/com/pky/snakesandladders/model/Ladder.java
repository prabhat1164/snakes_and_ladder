package com.pky.snakesandladders.model;

import com.pky.snakesandladders.enums.ObstacleType;

public class Ladder extends Obstacle{

    public Ladder(int top, int bottom) {
        super(bottom, top);
    }

    @Override
    public ObstacleType getObstacleType() {
        return ObstacleType.LADDER;
    }
}
