package com.pky.snakesandladders.model;

import com.pky.snakesandladders.enums.ObstacleType;

public class Snake extends Obstacle{

    public Snake(int head, int tail) {
        super(head, tail);
    }

    @Override
    public ObstacleType getObstacleType() {
        return ObstacleType.SNAKE;
    }
}
