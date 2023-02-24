package first.steps.in.coding.lab;

/*Божидара разполага с няколко къщи на Черноморието и желае да озелени дворовете на някои от тях,
като по този начин създаде уютна обстановка и комфорт на гостите си. За целта е наела фирма.
Напишете програма, която изчислява необходимате сума, които Божидара ще трябва да заплати на фирмата изпълнител на проекта.
Цената на един кв. м. е 7.61 лв със ДДС.
Понеже нейният двор е доста голям, фирмата изпълнител предлага 18% отстъпка от крайната цена.
Вход: От конзолата се прочита само един ред:
1.	Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00 … 10000.00]
Изход: На конзолата се отпечатват два реда:
•	"The final price is: {крайна цена на услугата} lv."
•	"The discount is: {отстъпка} lv."
*/
import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMeters = Double.parseDouble(scanner.nextLine());

        double price = squareMeters * 7.61;
        double discount =  price * 0.18;
        double finalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv.\nThe discount is: %.2f lv.", finalPrice, discount);


    }
}
