package loops.forloop.lab;

import java.util.Scanner;

/*Напишете програма, която чете текст (стринг), въведен от потребителя и печата всеки символ от текста на отделен ред.
Примерен вход1: softuni
Примерен изход1:
    s
    o
    f
    t
    u
    n
    i
Примерен вход2: ice cream
Примерен изход2:
    i
    c
    e

    c
    r
    e
    a
    m*/

public class P05CharacterSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
                                                     
        for (int i = 0; i < text.length(); i++) { 
            System.out.println(text.charAt(i));
            //OR: 
            /* char symbol = text.charAt(i); //зависи дали искам да си пазя променливата char symbol или не
            System.out.println(symbol); */
        }

        //По-подробно обяснение:
       // System.out.println("..........");
/*      String text2 = "Zornitza"; //
        String text3 = "Kaprieva"; //можем и с повече от един стринг

        int length = text.length(); //инциализираме int length (тя е равна на дължината на стринга)
        //System.out.println(length);

        char symbol = text.charAt(0); //note: винаги започваме от 0 ==> това е пътрвият символ
        //System.out.println(symbol);

        for (int i = 0; i < text2.length(); i++) { //( i < text.length(); //== дължината, но без да я включваме, ако сложим <= ще стане до дължината вкл, т.е. е с една итерация повече и ще дадае грешка)
            //System.out.println(text2.charAt(i));
           System.out.println(text3.charAt(i)); //можем и с повече от един стринг, но да внимаваме дължината на кой стринг сме задали в цикъла
        }
        //NOTE:
//      for (int i = 0; i < text.length(); i++) { //ако не сме инциализирали int length: for (int i = 0; i < text.length(); i++) { == това ще принтира 1,2,3...каквато е дължината на стринга
//            System.out.println(i);
//        }*/
    }
}
