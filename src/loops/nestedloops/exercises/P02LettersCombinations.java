package loops.nestedloops.exercises;

import java.util.Scanner;

/*Напишете програма, която да принтира на конзолата всички комбинации от 3 букви в зададен интервал,
като се пропускат комбинациите съдържащи зададена от конзолата буква. Накрая трябва да се изпринтира броят на отпечатаните комбинации.
Вход
Входът се чете от конзолата и съдържа точно 3 реда:
Ред 1.	Малка буква от английската азбука за начало на интервала – от ‘a’ до ‚z’.
Ред 2.	Малка буква от английската азбука за край на интервала  – от първата буква до ‚z’.
Ред 3.	Малка буква от английската азбука – от ‘a’ до ‚z’ – като комбинациите съдържащи тази буквата се пропускат.
Изход
Да се отпечатат на един ред всички комбинации отговарящи на условието плюс броят им разделени с интервал.
Примерен вход1: a c b
Примерен изход1: aaa aac aca acc caa cac cca ccc 8
Примерен вход2: a c z
Примерен изход2: aaa aab aac aba abb abc aca acb acc baa bab bac bba bbb bbc bca bcb bcc caa cab cac cba cbb cbc cca ccb ccc 27*/

public class P02LettersCombinations {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        char omitted = scanner.next().charAt(0);
        int count = 0;

        String combinations = "";
        for (char i = start; i <= end; i++) {
            if (i != omitted){
                for (char j = start; j <= end; j++) {
                    if (j != omitted){
                        for (char k = start; k <= end; k++) {
                            if (k != omitted){
                                count++;
                                combinations +=  "" + i + j + k + " ";
                            }
                        }
                    }
                }
            }
        }

        System.out.printf("%s%d", combinations, count);
    }
}
