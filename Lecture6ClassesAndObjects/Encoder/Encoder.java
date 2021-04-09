package by.jrr.HomeWork.Lecture6ObjectsAndClasses.Encoder;

import javax.swing.*;
import java.util.Scanner;

public class Encoder {
    Scanner scanner = new Scanner(System.in);

    short code;
    char symbol;


    public void encode(short code){
        code = scanner.nextShort();
        symbol = (char) code;
        JOptionPane.showMessageDialog(null,"Это символ: "+ symbol);
  }
   public void decode(char symbol){
        symbol = scanner.next().charAt(0);
        code = (short) symbol;
       JOptionPane.showMessageDialog(null,"Это № юникода: " + code);
        scanner.close();
    }
}
