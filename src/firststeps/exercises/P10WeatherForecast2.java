package firststeps.exercises;

import java.util.Scanner;

//Напишете програма, която при въведени градуси (реално число) принтира какво е времето, като имате предвид следната таблица:
//        Градуси	    Време
//        26.00 - 35.00	Hot
//        20.1 - 25.9 	Warm
//        15.00 - 20.00	Mild
//        12.00 - 14.9	Cool
//        5.00 - 11.9	Cold
//Ако се въведат градуси, различни от посочените в таблицата, да се отпечата "unknown".

public class P10WeatherForecast2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());

        if(degrees >= 5 && degrees < 12){
            System.out.println("Cold");
        } else if(degrees >= 12 && degrees < 15){
            System.out.println("Cool");
        }  else if(degrees >= 15 && degrees <= 20){
        System.out.println("Mild");
        } else if(degrees > 20 && degrees < 26){
            System.out.println("Warm");
        } else if(degrees >= 26 && degrees <= 35){
        System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}

