package loops.whileloop.practice;

import java.util.Scanner;

/*Поканени сте на 30-ти рожден ден, на който рожденикът черпи с огромна торта.
Той обаче не знае колко парчета могат да си вземат гостите от нея.
Вашата задача е да напишете програма, която изчислява броя на парчетата,
които гостите са взели, преди тя да свърши.
Ще получите размерите на тортата в сантиметри
(широчина и дължина – цели числа в интервала [1...1000])
и след това на всеки ред, до получаване на командата "STOP" или докато не свърши тортата,
броят на парчетата, които гостите вземат от нея.
Парчетата са квадратни с размер  1 см .
Да се отпечата на конзолата един от следните редове:
•	"{брой парчета} pieces are left." - ако стигнете до STOP и има останали парчета торта.
•	"No more cake left! You need {брой недостигащи парчета} pieces more."*/

public class P06Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine(); //брой парчета или "STOP"

        int countAllPieces = width * length;
        while (!command.equals("STOP")){ //програмата ще спре, ако изпишем STOP
            int currentCountPieces = Integer.parseInt(command); //парчетата, които някой си е взел (преобтазуваме String на int)
            countAllPieces -= currentCountPieces;

            if (countAllPieces <= 0) { //ако някой иска да си вземе повече парчета, ще останат минусняколко. Иаползваме Math.abs за да пресметнвм колко парчета са ни нужни и да не е отрицателна стойност.
                //System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countAllPieces)); //можем да го принтираме и след цикъла, в последното if, както преценим, че е по-логично
                break; //прекратяваме цикъла, когато парчетата не ни стигат
            }
            
            command = scanner.nextLine(); //ако условието на цикъла е изпълнено, отново можем да въведем команда
        }

        if (countAllPieces > 0) {
            System.out.printf("%d pieces are left.", countAllPieces);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countAllPieces));
        }
    }
}
