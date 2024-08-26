package ro.scoalainformala;

import java.awt.*;

public abstract class Rectangle implements Shape {

    private double heigth;
    private double width;

    public Rectangle(double heigth, double width){
        this.heigth = heigth;
        this.width = width;}

        public double getArea(){
            return heigth * width;
        }

}
