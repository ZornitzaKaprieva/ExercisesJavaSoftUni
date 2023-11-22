package loops.forloop.exercises;

import java.util.Scanner;

/*За даден период от време, всеки ден в болницата пристигат пациенти за преглед. Тя разполага първоначално със 7 лекари.
Всеки лекар може да преглежда само по един пациент на ден, но понякога има недостиг на лекари,
затова останалите пациенти се изпращат в други болници.
Всеки трети ден, болницата прави изчисления и ако броят на непрегледаните пациенти е по-голям от броя на прегледаните,
се назначава още един лекар. Като назначаването става преди да започне приемът на пациенти за деня.
Напишете програма, която изчислява за дадения период броя на прегледаните и непрегледаните пациенти.
Вход
Входът се чете от конзолата и съдържа:
•	На първия ред – периода, за който трябва да направите изчисления. Цяло число в интервала [1 ... 1000]
•	На следващите редове(равни на броят на дните) – броя пациенти, които пристигат за преглед за текущия ден. Цяло число в интервала [0…10 000]
Изход
Да се отпечатат на конзолата 2 реда :
•	На първия ред: "Treated patients: {брой прегледани пациенти}."
•	На втория ред: "Untreated patients: {брой непрегледани пациенти}."
Примерен вход1: 4  7  27  9  1
Примерен изход1:
    Treated patients: 23.
    Untreated patients: 21.
Примерен вход2: 6  25  25  25  25  25  2
Примерен изход2:
    Treated patients: 40.
    Untreated patients: 87.*/

public class P02Hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int dayCount = 1;
        int treatedPatients = 0;
        int untreatedPatients = 0;


        for (int i = 1; i <= days; i++) {

            int patientsForADay = Integer.parseInt(scanner.nextLine());


            if (dayCount % 3 == 0 && untreatedPatients > treatedPatients ){
                doctors++;
            }

            dayCount++;

            if (patientsForADay >= doctors){
                treatedPatients += doctors;
                untreatedPatients += patientsForADay - doctors;
            } else {
                treatedPatients += patientsForADay;
                untreatedPatients += 0;
            }
        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.%n", untreatedPatients);
    }
}
