package nestedLoops.nestedLoopsPractice;

import java.util.Scanner;

/*Напишете програма, която чете от конзолата две шестцифрени цели числа в диапазона от 100000 до 300000.
Винаги първото въведено число ще бъде по малко от второто.
На конзолата да се отпечатат на 1 ред разделени с интервал всички числа, които се намират между двете,
прочетени от конзолата числа и отговарят на следното условие:
•	сумата от цифрите на четни и нечетни позиции да са равни.
Ако няма числа, отговарящи на условието на конзолата не се извежда резултат.
*/
public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int currentNum = firstNum; currentNum <= secondNum; currentNum++) { //числата се инкрементират в границите между 2те въведени числа.

            //знаем, че числата винаги ще са 6-цифрени.
                                                    // (hint: с деленето на 2 цели числа получаваме цяло число, с %10 получваваме последната цифра от числото ):
            int firstDigit = currentNum / 100000; // с целочисленето делене получаваме 1вата цифра от нашето 6цифрено число
            int secondDigit = (currentNum / 10000) % 10; // с %10 получваваме последната цифра от числото.  (ако го оставим така ще излязат първите 2 цифри от числото: currentNum / 1000;)
            int thirdDigit = (currentNum / 1000) % 10; // т.е. така взимаме 3тата цифра от числото (а не  първите 3)
            int fourthDigit = (currentNum / 100) % 10; // така взимаме 4тата цифра от числото
            int fifthDigit = (currentNum / 10) % 10; // 5тата цифра от числото
            int sixthDigit = currentNum % 10; // 6тата цифра от числото e последна ==> достатъчно е да я разделим само с целочислено делене (%)

            int evenSum =  secondDigit + fourthDigit + sixthDigit;
            int oddSum =  firstDigit + thirdDigit + fifthDigit;

            if (evenSum == oddSum){
                System.out.printf("%d ", currentNum);
            }
        }
    }
}
