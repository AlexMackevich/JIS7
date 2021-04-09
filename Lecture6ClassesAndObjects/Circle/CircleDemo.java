package by.jrr.HomeWork.Lecture6ObjectsAndClasses.Circle;

import javax.swing.*;

public class CircleDemo {

    public static void main(String[] args) {
        Circle areaCalculation = new Circle();

        JOptionPane.showMessageDialog(null, areaCalculation.calculateArea());
       // System.out.println(areaCalculation.calculateArea());
    }
}
