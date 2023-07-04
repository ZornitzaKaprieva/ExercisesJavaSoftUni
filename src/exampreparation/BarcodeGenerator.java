package exampreparation;

import java.util.Scanner;

/*Техниката в магазин за коледни украси се разваля. Артикулите, които съдържат четни числа в своя баркод не могат да бъдат маркирани от касиерите.
 Вашата задача е, да напишете програма, която генерира всички баркодове, които НЕ съдържат четни цифри в себе си.
 Вход:
 •	Две четирицифрени числа, които показват обхвата на баркодовете, които трябва да промените.
 •	Първи ред – четирицифрено число – началото на обхвата. Цяло число в интервала [1000…9999]
 •	Втори ред – четирицифрено число – края на обхвата. Цяло число в интервала [1000…9999]
 Изход:
 На конзолата трябва да се отпечатат всички "баркодове", които НЕ съдържат четна цифра в себе си, разделени с интервал.*/

public class BarcodeGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        int startFirst = startCode / 1000;
        int startSecond = (startCode /100) % 10;
        int startThird = (startCode /10) % 10;
        int startFourth = startCode % 10;

        int endFirst = endCode / 1000;
        int endSecond = (endCode /100) % 10;
        int endThird = (endCode /10) % 10;
        int endFourth = endCode % 10;

        //solution 1:
        for (int i = startFirst; i <= endFirst; i++) {
            for (int j = startSecond; j <= endSecond; j++) {
                for (int k = startThird; k <= endThird; k++) {
                    for (int l = startFourth; l <= endFourth; l++) {
                        if (i % 2 !=0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }

        //solution 2:
//        for (int i = startFirst; i <= endFirst; i++) {
//            if (i % 2 !=0){
//                for (int j = startSecond; j <= endSecond; j++) {
//                    if (j % 2 != 0){
//                        for (int k = startThird; k <= endThird; k++) {
//                            if (k % 2 != 0){
//                                for (int l = startFourth; l <= endFourth; l++) {
//                                    if (l % 2 != 0){
//                                        System.out.printf("%d%d%d%d ", i, j, k, l);
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
    }
}
