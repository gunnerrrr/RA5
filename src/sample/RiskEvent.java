package sample;

import java.util.ArrayList;

public class RiskEvent {
    private String name;
    private double ER;
    private ArrayList<Double> marks;
    private double ex1;
    private double ex2;
    private double ex3;
    private double ex4;
    private double ex5;
    private double ex6;
    private double ex7;
    private double ex8;
    private double ex9;
    private double ex10;

    public RiskEvent(String name, ArrayList<Double> marks) {
        this.name = name;
        this.marks = marks;
        this.calculateER();
        this.calculateEX();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getER() {
        return ER;
    }

    public double getEx1() {
        return ex1;
    }

    public double getEx2() {
        return ex2;
    }

    public double getEx3() {
        return ex3;
    }

    public double getEx4() {
        return ex4;
    }

    public double getEx5() {
        return ex5;
    }

    public double getEx6() {
        return ex6;
    }

    public double getEx7() {
        return ex7;
    }

    public double getEx8() {
        return ex8;
    }

    public double getEx9() {
        return ex9;
    }

    public double getEx10() {
        return ex10;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
        this.calculateER();
        this.calculateEX();
    }
    public void calculateER() {
        double er=0;
        for (double n:this.marks) {
            er+=n;
        }
        er/=this.marks.size();
        this.ER=er;
    }
    public void calculateEX() {
        ex1=marks.get(0);
        ex2=marks.get(1);
        ex3=marks.get(2);
        ex4=marks.get(3);
        ex5=marks.get(4);
        ex6=marks.get(5);
        ex7=marks.get(6);
        ex8=marks.get(7);
        ex9=marks.get(8);
        ex10=marks.get(9);
    }
}
