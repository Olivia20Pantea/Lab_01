package com.company;
import javax.swing.*;
public class Main{
    public static void main(String[] args){
    float suma = 0;
    String x = JOptionPane.showInputDialog("How many numbers:");
    int n = Integer.parseInt(x);

    for(int i = 0; i < n ; i++)
    {  String var = JOptionPane.showInputDialog("Type number  #"+(i+1)+" : ");

        suma += Integer.parseInt(var);
    }
    float average = suma / n;
    JOptionPane.showMessageDialog(null, "The average is: " + average);
        }
}