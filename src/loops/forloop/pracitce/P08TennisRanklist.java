package loops.forloop.pracitce;

import java.util.Scanner;

/*Григор Димитров е тенисист, чиято следваща цел е изкачването в световната ранглиста по тенис за мъже.
През годината Гришо участва в определен брой турнири, като за всеки турнир получава точки, които зависят от позицията, на която е завършил в турнира. Има три варианта за завършване на турнир:
	W - ако е победител получава 2000 точки
	F - ако е финалист получава 1200 точки
	SF - ако е полуфиналист получава 720 точки
Напишете програма, която изчислява колко ще са точките на Григор след изиграване на всички турнири, като знаете с колко точки стартира сезона. Също изчислете колко точки средно печели от всички изиграни турнири и колко процента от турнирите е спечелил.
Вход
От конзолата първо се четат два реда:
•	Брой турнири, в които е участвал – цяло число в интервала [1…20]
•	Начален брой точки в ранглистата - цяло число в интервала [1...4000]
За всеки турнир се прочита отделен ред:
•	Достигнат етап от турнира – текст – "W", "F" или "SF"
Изход
Отпечатват се три реда в следния формат:
•	"Final points: {брой точки след изиграните турнири}"
•	"Average points: {средно колко точки печели за турнир}"
•	"{процент спечелени турнири}%"
Средните точки да бъдат закръглени към най-близкото цяло число надолу, а процентът да се форматира до втората цифра след десетичния знак.
Примерен вход1: 5  1400  F  SF  W  W  SF
Примерен изход1:
    Final points: 8040
    Average points: 1328
    40.00%
Примерен вход2: 4  750  SF  W  SF  W
Примерен изход2:
    Final points: 6190
    Average points: 1360
    50.00%*/

public class P08TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());  // [1…20]
        int initialPoints = Integer.parseInt(scanner.nextLine());  // [1...4000]

        boolean isValidNOF = numberOfTournaments >= 1 && numberOfTournaments <= 20;
        boolean isValidPoints = initialPoints >= 1 && initialPoints <= 4000;
        boolean isValidInput = isValidNOF && isValidPoints;

        int counterW = 0;
        int counterF = 0;
        int counterSF = 0;

        int pointsFromTournamentsW = 0;
        int pointsFromTournamentsF = 0;
        int pointsFromTournamentsSF = 0;

        for (int i = 1; i <= numberOfTournaments; i++) { //from 1, not 0!
            String stage = scanner.nextLine(); // "W", "F" или "SF"

            if (stage.equals("W") && isValidInput) {
                counterW++;
                pointsFromTournamentsW = counterW * 2000;
            } else if (stage.equals("F") && isValidInput) {
                counterF++;
                pointsFromTournamentsF = counterF * 1200;
            } else if (stage.equals("SF") && isValidInput) {
                counterSF++;
                pointsFromTournamentsSF = counterSF * 720;
            }
        }

//            switch (stage) {
//                case "W":
//                    if (isValidInput) {
//                        counterW++;
//                        pointsFromTournamentsW = counterW * 2000;
//                    }
//                    break;
//                case "F":
//                    if (isValidInput) {
//                        counterF++;
//                        pointsFromTournamentsF = counterF * 1200;
//                    }
//                    break;
//                case "SF":
//                    if (isValidInput) {
//                        counterSF++;
//                        pointsFromTournamentsSF = counterSF * 720;
//                    }
//                    break;
//            }

        int pointsFromTournamentsSum = pointsFromTournamentsW + pointsFromTournamentsF + pointsFromTournamentsSF;
        //int counterTournaments = counterW + counterF + counterSF;
        int overallPoints = initialPoints + pointsFromTournamentsSum;

        double averagePointsFromTournaments = Math.floor((pointsFromTournamentsSum * 1.0) / numberOfTournaments);
        double percentWin = ((counterW * 1.0) / numberOfTournaments) * 100;

        System.out.printf("Final points: %d\n", overallPoints);
        System.out.printf( "Average points: %.0f\n", averagePointsFromTournaments);
        System.out.printf("%.2f%%\n", percentWin);
    }
}
