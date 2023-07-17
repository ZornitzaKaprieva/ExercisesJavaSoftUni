package exampreparation;

import java.util.Scanner;

/*Мобилен оператор предлага договори с различна месечна такса в зависимост от срока - 1 или 2 години.
Да се напише програма, която изчислява дължимата сума, която трябва да се плати за определен брой месеци.
срок / тип	    Small	    Middle	    Large	    ExtraLarge
1 година(one)	9.98 лв.	18.99 лв.	25.98 лв.	35.99 лв.
2 години(two)	8.58 лв.	17.09 лв.	23.59 лв.	31.79 лв.
Условия:
•	при добавен мобилен интернет, към таксата за един месец се добавя:
o	при такса по-малка или равна на 10.00 лв.  5.50 лв.
o	при такса по-малка или равна на 30.00 лв.  4.35 лв.
o	при такса по-голяма от 30.00 лв.  3.85 лв.
•	ако договорът e за две години, общата сума се намалява с 3.75%
Вход
От конзолата се четат 3 реда:
1.	Срок на договор – текст – "one", или "two"
2.	Тип на договор – текст – "Small",  "Middle", "Large"или "ExtraLarge"
3.	Добавен мобилен интернет – текст – "yes" или "no"
4.	Брой месеци за плащане - цяло число в интервала [1 … 24]
Изход
На конзолата се отпечатва 1 ред:
•	Цената, която заплаща клиентът, форматирана до втория знак след десетичната запетая, в следния формат:  "{цената} lv."*/

public class MobileOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String contract = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        int monthsToPay = Integer.parseInt(scanner.nextLine());

        double payPerMonth = 0;
        switch (type){
            case "Small":
                switch (contract){
                    case "one":
                        payPerMonth = 9.98;
                        break;
                    case "two":
                        payPerMonth = 8.58;
                        break;
                }
                break;
            case "Middle":
                switch (contract){
                    case "one":
                        payPerMonth = 18.99;
                        break;
                    case "two":
                        payPerMonth = 17.09;
                        break;
                }
                break;
            case "Large":
                switch (contract){
                    case "one":
                        payPerMonth = 25.98;
                        break;
                    case "two":
                        payPerMonth = 23.59;
                        break;
                }
                break;
            case "ExtraLarge":
                switch (contract){
                    case "one":
                        payPerMonth = 35.99;
                        break;
                    case "two":
                        payPerMonth = 31.79;
                        break;
                }
                break;
        }

        double internetPerMonth = 0;
        if (internet.equals("yes")){
            if (payPerMonth <= 10){
                internetPerMonth = 5.5;
            } else if (payPerMonth <= 30){
                internetPerMonth = 4.35;
            } else if (payPerMonth > 30){
                internetPerMonth = 3.85;
            }
        } else {
            internetPerMonth = 0;
        }

        double sum = monthsToPay * (payPerMonth + internetPerMonth);
        if (contract.equals("two")){
            sum -= sum * 0.0375;
        }

        System.out.printf("%.2f lv.", sum);
    }
}
