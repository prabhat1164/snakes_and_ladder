package com.pky.snakesandladders.model;

import com.pky.snakesandladders.enums.ObstacleType;
import lombok.Getter;

@Getter
public abstract class Obstacle {
    protected int src;
    protected int dest;

    public Obstacle(int src, int dest){
        this.src = src;
        this.dest = dest;
    }

    public int movePlayer(){
        return dest;
    }

    public abstract ObstacleType getObstacleType();
}
