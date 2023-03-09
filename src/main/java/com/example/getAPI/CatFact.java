package com.example.getAPI;

public class CatFact {

    String fact;
    int length;

    public CatFact(){

    }

    public String getFact() {
        return fact;
    }

    public int getLength() {
        return length;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "CatFact{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }
}
