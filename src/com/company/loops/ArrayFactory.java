package com.company.loops;

public class ArrayFactory {
    private int x;
    public ArrayFactory(int x){
        this.x=x;
    }
    public int[] oneDimension(){
        return new int[x];
    }
    public int[][] twoDimensions(){
        return new int[x][x];
    }
}
