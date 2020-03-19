package com.company;

/*

1519. Level 15 Lection 12. Different methods for different types

1. Read data from the console until the word "exit" is entered.
2. For each value except “exit“, call the print method. If the value is:
2.1. contains the point ‘.‘, then call the print method for Double;
2.2. greater than zero, but less than 128, then call the print method for short;
2.3. less than zero or greater than or equal to 128, then call the print method for Integer;
2.4. otherwise, call the print method of String.
 

Requirements:
1. The program should read data from the keyboard.
2. The program should stop reading data from the keyboard after the "exit" line has been entered.
3. If the entered string contains a period (".") And can be correctly converted to a Double type, the print (Double value) method must be called.
4. If the entered string can be correctly converted to a short number and the resulting number is greater than 0, but less than 128, the print (short value) method must be called.
5. If the entered string can be correctly converted to an integer type and the resulting number is less than or equal to 0 or greater than or equal to 128, the print (Integer value) method must be called.
6. In all other cases, the print (String value) method must be called.


 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String text=reader.readLine();
            if (text.equals("exit")){
                reader.close();
                break;
            }
            try {
                if (text.contains(".")){
                    double value=Double.parseDouble(text);
                    print(value);
                }
                else if (Integer.parseInt(text)>0&&Integer.parseInt(text)<128){
                    short value=Short.parseShort(text);
                    print(value);
                }
                else if (Integer.parseInt(text)>=128||Integer.parseInt(text)<=0){
                    int value=Integer.parseInt(text);
                    print(value);
                }
                else {
                    String value=text;
                }
            }
            catch (Exception e){
                print(text);
            }
        }
    }
    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }
    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }
    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }
    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

