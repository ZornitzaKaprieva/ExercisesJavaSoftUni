package whileLoop.whileLoopPractice;

import java.util.Scanner;

/*Ани отива до родния си град след много дълъг период извън страната.
Прибирайки се вкъщи, тя вижда старата библиотека на баба си
и си спомня за любимата си книга. Помогнете на Ани, като напишете програма,
в която тя въвежда търсената от нея книга (текст).
Докато Ани не намери любимата си книга или не провери всички книги в библиотеката,
програмата трябва да чете всеки път на нов ред името на всяка следваща книга (текст),
която тя проверява.
Книгите в библиотеката са свършили щом получите текст "No More Books".
•	Ако не открие търсената книгата да се отпечата на два реда:
o	"The book you search is not here!"
o	"You checked {брой} books."
•	Ако открие книгата си се отпечатва един ред:
o	"You checked {брой} books and found it."
*/
public class P01OldBooks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String inputBook = scanner.nextLine();

        int counterBooks = 0;

        while (!searchedBook.equals(inputBook)) {


            if(inputBook.equals("No More Books")) {
                System.out.printf("The book you search is not here!\nYou checked %d books.\n", counterBooks);
                break;
            }

            counterBooks++;
            inputBook = scanner.nextLine();
        }

        if (searchedBook.equals(inputBook)) {
            System.out.printf("You checked %d books and found it.\n", counterBooks);
        }
    }
}
