package by.jrr.HomeWork.Lecture6ObjectsAndClasses.Swing;

import javax.swing.*;

public class Messages {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog(null, "Присвоейте значение а: ");
        JOptionPane.showMessageDialog(null, "Вы ввели: " + a);
    }
}
