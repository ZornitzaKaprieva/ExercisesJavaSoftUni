package loops.nestedloops.lab;

import java.util.Scanner;

/*Напишете програма, която извежда на конзолата номерата на стаите в една сграда (в низходящ ред),
като са изпълнени следните условия:
•	На всеки четен етаж има само офиси
•	На всеки нечетен етаж има само апартаменти
•	Всеки апартамент се означава по следния начин : А{номер на етажа}{номер на апартамента}, номерата на апартаментите започват от 0.
•	Всеки офис се означава по следния начин : О{номер на етажа}{номер на офиса}, номерата на офисите също започват от 0.
•	На последният етаж винаги има апартаменти и те са по-големи от останалите, за това пред номера им пише 'L', вместо 'А'. Ако има само един етаж, то има само големи апартаменти!
От конзолата се прочитат две цели числа - броят на етажите и броят на стаите за един етаж.
Примерен вход1: 6  4
Примерен изход1:
L60 L61 L62 L63
A50 A51 A52 A53
O40 O41 O42 O43
A30 A31 A32 A33
O20 O21 O22 O23
A10 A11 A12 A13
Примерен вход2: 9  5
Примерен изход2:
L90 L91 L92 L93 L94
O80 O81 O82 O83 O84
A70 A71 A72 A73 A74
O60 O61 O62 O63 O64
A50 A51 A52 A53 A54
O40 O41 O42 O43 O44
A30 A31 A32 A33 A34
O20 O21 O22 O23 O24
A10 A11 A12 A13 A14*/

public class P06Building {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberFloors = Integer.parseInt(scanner.nextLine());
        int numberRooms = Integer.parseInt(scanner.nextLine());

        for (int f = numberFloors; f >= 1 ; f--) {
            for (int r = 0; r < numberRooms; r++) {
                if (f == numberFloors){
                    System.out.printf("L%d%d ", f, r);
            }else if (f % 2 == 0) {
                    System.out.printf("O%d%d ", f, r);
                } else {
                    System.out.printf("A%d%d ", f, r);
                }
            }
            System.out.println(); //нов ред след всяка итерация (всеки етаж излиза на нов ред)
        }
    }
}
