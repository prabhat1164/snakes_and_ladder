package com.pky.snakesandladders.factory;

import com.pky.snakesandladders.enums.ObstacleType;
import com.pky.snakesandladders.model.Ladder;
import com.pky.snakesandladders.model.Obstacle;
import com.pky.snakesandladders.model.Snake;

public class ObstacleFactory {
    public static Obstacle createObstacle(ObstacleType type, int up, int down){
        return switch (type){
            case SNAKE -> new Snake(up, down);
            case LADDER -> new Ladder(up, down);
            default -> throw new IllegalArgumentException("Invalid obstacle type");
        };
    }
}
