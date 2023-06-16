package loops.forloop.pracitce;

import java.util.Scanner;

/*Лили вече е на N години. За всеки свой рожден ден тя получава подарък.
•	За нечетните рождени дни (1, 3, 5...n) получава играчки.
•	За четните рождени дни (2, 4, 6...n) получава пари.
За втория рожден ден получава 10.00 лв,
като сумата се увеличава с 10.00 лв., за всеки следващ четен рожден ден (2 -> 10, 4 -> 20, 6 -> 30...и т.н.).
През годините Лили тайно е спестявала парите.
Братът на Лили, в годините, които тя получава пари, взима по 1.00 лев от тях.
Лили продала играчките получени през годините, всяка за P лева и добавила сумата към спестените пари.
С парите искала да си купи пералня за X лева. Напишете програма, която да пресмята, колко пари е събрала и дали ѝ стигат да си купи пералня.
Вход
Програмата прочита 3 числа, въведени от потребителя, на отделни редове:
•	Възрастта на Лили - цяло число в интервала [1...77]
•	Цената на пералнята - число в интервала [1.00...10 000.00]
•	Единична цена на играчка - цяло число в интервала [0...40]
Изход
Да се отпечата на конзолата един ред:
•	Ако парите на Лили са достатъчни:
o	"Yes! {N}" - където N е остатъка пари след покупката
•	Ако парите не са достатъчни:
o	"No! {М}" - където M е сумата, която не достига
Числата N и M трябва да за форматирани до вторият знак след десетичната запетая.*/

public class P04CleverLily {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine()); //[1...77]
        double priceWashingMachine = Double.parseDouble(scanner.nextLine()); //[1.00...10 000.00]
        int priceToy = Integer.parseInt(scanner.nextLine()); // [0...40]

        boolean isValidAge = age >= 1 && age <= 77;
        boolean isValidPriceWashingMachine = priceWashingMachine >= 1.0 && priceWashingMachine <= 10000.0;
        boolean isValidPriceToy = priceToy >= 0 && priceToy <= 40;
        boolean isValidInput = isValidAge && isValidPriceWashingMachine && isValidPriceToy;

        double overallSumForBirthday = 0; 
        double countToys = 0;

        for (int i = 1; i <= age; i++) { //i == current age
            if (i % 2 == 0) {
                overallSumForBirthday = overallSumForBirthday + (i * 5 - 1); //защото сме открили закономерност (2x5=10; 4x5=20 i t.n.)
            } else {
                countToys++;
            }
        }

        double sumFromToys = countToys * priceToy;
        double savedMoney = overallSumForBirthday + sumFromToys;
        double diff = Math.abs(priceWashingMachine - savedMoney);

        if (savedMoney >= priceWashingMachine && isValidInput) {
            System.out.printf("Yes! %.2f\n", diff);
        } else if (savedMoney < priceWashingMachine && isValidInput){
            System.out.printf("No! %.2f\n", diff);
        }
    }
}
