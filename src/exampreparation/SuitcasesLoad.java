package exampreparation;

import java.util.Scanner;

/*Напишете програма, която ви помага при товаренето на куфари в багажника на самолет.
Всеки самолет има определен капацитет на багажника. До получаване на команда "End" ще получавате обем на куфар.
Обемът на всеки трети куфар трябва да се увеличава с 10%, поради загубата на пространство при начина на подреждане.
Ако свободното пространството в даден момент е по-малко от обема на куфар товаренето трябва да прекъсне.
Вход
Първоначално се чете един ред:
•	Капацитетът на багажника – реално число в диапазона [100.0…6000.0]
След това до получаване на команда "End" или до запълване на багажника, се чете по един ред:
o	Обем на куфар – реално число в диапазона [100.0…6000.0]
Изход
На конзолата да се отпечатат следните редове според случая:
•	При получаване на командата "End" се печата:
"Congratulations! All suitcases are loaded!"
•	Ако обемът на куфара е по-голям от оставащото пространство в багажника:
"No more space!"
•	Накрая винаги се отпечатва статистика – колко багажа са натоварени:
"Statistic: {брой натоварени багажи} suitcases loaded."*/

public class SuitcasesLoad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double suitcaseSum = 0;
        int suitcasesCount = 0;
        boolean isFull = false;
        while(!command.equals("End")){
            double suitcaseVolume = Double.parseDouble(command);

            suitcaseSum += suitcaseVolume;
            if(suitcaseSum >= capacity){
                isFull = true;
                break;
            }
            suitcasesCount++;
            if(suitcasesCount % 3 == 0){
                suitcaseVolume += suitcaseVolume * 0.1;
            }

            command = scanner.nextLine();
        }

        if (!isFull) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }

        System.out.printf("Statistic: %d suitcases loaded.", suitcasesCount);
    }
}
