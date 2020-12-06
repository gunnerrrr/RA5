package sample;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

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
    private double ex1r;
    private double ex2r;
    private double ex3r;
    private double ex4r;
    private double ex5r;
    private double ex6r;
    private double ex7r;
    private double ex8r;
    private double ex9r;
    private double ERr;
    private double ex10r;
    private double lrer;
    private double vrer;
    private String priority;
    private  StringProperty riskSolution = new SimpleStringProperty();
    private String priorityR;
    private double lrerR;
    private double vrerR;

    public String getPriorityR() {
        return priorityR;
    }

    public double getLrerR() {
        return lrerR;
    }

    public double getVrerR() {
        return vrerR;
    }

    public void setPriorityR(String priorityR) {
        this.priorityR = priorityR;
    }


    public double getEx1r() {
        return ex1r;
    }

    public double getEx2r() {
        return ex2r;
    }

    public double getEx3r() {
        return ex3r;
    }

    public double getEx4r() {
        return ex4r;
    }

    public double getEx5r() {
        return ex5r;
    }

    public double getEx6r() {
        return ex6r;
    }

    public double getEx7r() {
        return ex7r;
    }

    public double getEx8r() {
        return ex8r;
    }

    public double getEx9r() {
        return ex9r;
    }

    public double getEx10r() {
        return ex10r;
    }

    public final StringProperty riskSolutionProperty() {
        return this.riskSolution;
    }
    public final String getRiskSolution() {

        return riskSolutionProperty().get();
    }


    public final void setRiskSolution( String riskSolution) {
        this.riskSolutionProperty().set(riskSolution);
    }
    public RiskEvent(String name, ArrayList<Double> marks,double lrer) {
        this.name = name;
        this.marks = marks;
        this.setAllEx();
        this.calculateER();
        this.lrer=lrer;
        this.calculateVRER();
        this.CalculateResEx();
        calculateERr();
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public double getLrer() {
        return lrer;
    }

    public void setLrer(double lrer) {
        this.lrer = lrer;
    }

    public double getVrer() {
        return vrer;
    }

    public String getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    public double getERr() {
        return ERr;
    }

    public void setEx1r(double ex1r) {
        this.ex1r = ex1r;
    }

    public void setEx2r(double ex2r) {
        this.ex2r = ex2r;
    }

    public void setEx3r(double ex3r) {
        this.ex3r = ex3r;
    }

    public void setEx4r(double ex4r) {
        this.ex4r = ex4r;
    }

    public void setEx5r(double ex5r) {
        this.ex5r = ex5r;
    }

    public void setEx6r(double ex6r) {
        this.ex6r = ex6r;
    }

    public void setEx7r(double ex7r) {
        this.ex7r = ex7r;
    }

    public void setEx8r(double ex8r) {
        this.ex8r = ex8r;
    }

    public void setEx9r(double ex9r) {
        this.ex9r = ex9r;
    }

    public void setEx10r(double ex10r) {
        this.ex10r = ex10r;
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
        double factor = 1e2; // = 1 * 10^5 = 100000.
        this.ER=Math.round(er * factor) / factor;
    }
    public void calculateERr() {
        double er=ex1r+ex2r+ex3r+ex4r+ex5r+ex6r+ex7r+ex8r+ex9r+ex10r;
        er/=10;
        double factor = 1e2; // = 1 * 10^5 = 100000.
        this.ERr=Math.round(er * factor) / factor;
    }
    public void calculateVRER() {
        double x=ER*lrer;
        double factor = 1e2; // = 1 * 10^5 = 100000.
        vrer = Math.round(x * factor) / factor;
    }
    public void calculateLrerRAndVrerR () {
        double x=lrer*0.75;
        double factor = 1e2; // = 1 * 10^5 = 100000.
        this.lrerR=Math.round(x * factor) / factor;
        x=vrer*0.75;
        this.vrerR=Math.round(x * factor) / factor;
    }
    public void CalculateResEx(){
        double x=ex1*0.75;
        double factor = 1e2; // = 1 * 10^5 = 100000.
        ex1r=Math.round(x * factor) / factor;
        x=ex2*0.75;
        ex2r=Math.round(x * factor) / factor;
        x=ex3*0.75;
        ex3r=Math.round(x * factor) / factor;
        x=ex4*0.75;
        ex4r=Math.round(x * factor) / factor;
        x=ex5*0.75;
        ex5r=Math.round(x * factor) / factor;
        x=ex6*0.75;
        ex6r=Math.round(x * factor) / factor;
        x=ex7*0.75;
        ex7r=Math.round(x * factor) / factor;
        x=ex8*0.75;
        ex8r=Math.round(x * factor) / factor;
        x=ex9*0.75;
        ex9r=Math.round(x * factor) / factor;
        x=ex10*0.75;
        ex10r=Math.round(x * factor) / factor;
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
