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
        this.setAllEx();
        this.calculateER();
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

    public void setEx1(double ex1) {
        this.ex1 = ex1;
    }

    public void setEx2(double ex2) {
        this.ex2 = ex2;
    }

    public void setEx3(double ex3) {
        this.ex3 = ex3;
    }

    public void setEx4(double ex4) {
        this.ex4 = ex4;
    }

    public void setEx5(double ex5) {
        this.ex5 = ex5;
    }

    public void setEx6(double ex6) {
        this.ex6 = ex6;
    }

    public void setEx7(double ex7) {
        this.ex7 = ex7;
    }

    public void setEx8(double ex8) {
        this.ex8 = ex8;
    }

    public void setEx9(double ex9) {
        this.ex9 = ex9;
    }

    public void setEx10(double ex10) {
        this.ex10 = ex10;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
        this.calculateER();
        this.setAllEx();
    }
    public void calculateER() {
        double er=ex1+ex2+ex3+ex4+ex5+ex6+ex7+ex8+ex9+ex10;
        er/=10;
        this.ER=er;
    }
    public void setAllEx() {
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
