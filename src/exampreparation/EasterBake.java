package exampreparation;

import java.util.Scanner;

/*Предстои Великден и Деси е решила да изпече домашни козунаци за колегите си.
Главните продукти, които ще трябват на Деси са: брашно и захар.
Един пакет захар е 950 грама, а един пакет брашно е 750 грама.
Напишете програма, която изчислява колко пакета захар и брашно трябва да купи Деси,
за да й стигнат за направата на козунаците, като знаете за всеки един козунак по колко грама захар и брашно са изразходени.
Също намерете кое е най-голямото количество захар и брашно, които са използвани.
Вход
От конзолата се чете 1 ред:
•	 Броят на козунаците – цяло число в интервала [1 ... 100]
За всеки козунак се чете:
o	Количество изразходвана захар (грамове) – цяло число в интервала [1 … 10000]
o	Количество изразходвано брашно (грамове) – цяло число в интервала [1 … 10000]
Изход
Да се отпечатат на конзолата 3 реда:
•	"Sugar: {брой нужни пакети захар}"
•	"Flour: {брой нужни пакет брашно}"
•	"Max used flour is {максимално количество грамове брашно, използвани за правенето на козунак} grams, max used sugar is {максимално количество грамове захар, използвани за правенето на козунак} grams."
Пакетите захар и брашно да бъдат закръглени към най-близкото цяло число нагоре.*/

public class EasterBake {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int breadNum = Integer.parseInt(scanner.nextLine());

        double sumSugar = 0;
        double sumFlour = 0;
        int maxUsedSugar = 0;
        int maxUsedFlour = 0;

        for (int i = 1; i <= breadNum; i++){
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            if(sugar > maxUsedSugar){
                maxUsedSugar = sugar;
            } else {
                maxUsedSugar = maxUsedSugar;
            }

            if(flour > maxUsedFlour){
                maxUsedFlour = flour;
            } else {
                maxUsedFlour = maxUsedFlour;
            }

            sumSugar += sugar;
            sumFlour += flour;
        }

        double sugarPack = Math.ceil(sumSugar / 950);
        double flourPack = Math.ceil(sumFlour / 750);

        System.out.printf("Sugar: %.0f%n", sugarPack);
        System.out.printf("Flour: %.0f%n", flourPack);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.%n", maxUsedFlour, maxUsedSugar);
    }
}
