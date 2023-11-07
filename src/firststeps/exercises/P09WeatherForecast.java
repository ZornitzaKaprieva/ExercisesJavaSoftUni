package firststeps.exercises;

import java.util.Scanner;

/*Напишете програма, която познава дали е топло или студено навън.
От конзолата се чете един ред – текст, който подсказва какво е времето.
При въвеждане на "sunny" трябва да се отпечата "It's warm outside!".
Във всички останали случаи трябва да се отпечата "It's cold outside!".
Примерен вход1: sunny
Примерен изход1: It's warm outside!
Примерен вход2: snowy
Примерен изход2: It's cold outside!*/

public class P09WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        if(weather.equals("sunny")){
            System.out.print("It's warm outside!");
        } else{
            System.out.print("It's cold outside!");
        }
    }
}
