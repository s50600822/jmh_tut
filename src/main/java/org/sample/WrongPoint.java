package org.sample;

public record WrongPoint(int x, int y){
    @Override
    public int hashCode() {
        return 0;
    }
};