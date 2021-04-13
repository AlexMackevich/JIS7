package by.jrr.HomeWork.Lecture6ObjectsAndClasses.Circle;

import javax.swing.*;
import java.util.Scanner;

public class Circle {

  //static double radius;
    final double pi = 3.14;
  //  Scanner scanner = new Scanner(System.in);

    public Double calculateArea(){
        String number = JOptionPane.showInputDialog(null,"Введите число: ");
        double radius = Double.parseDouble(number);
        //radius = scanner.nextDouble();
        double area = Math.pow(radius, 2) * pi;
       // scanner.close();
        return area;
    }//Не оставляй в коде закомментированный код. Если он здесь не нужен удаляй его
}
