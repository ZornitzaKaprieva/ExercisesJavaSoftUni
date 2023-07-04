package exampreparation;

import java.util.Scanner;

/*Деси и отборът ѝ по баскетбол участват в турнири всеки месец, като всеки турнир се състои от определен брой мачове.
Всеки мач има краен резултат, на базата на който се определя победителят. Отборът, вкарал повече точки, се смята за победител.
Помогнете на Деси да направи статистика за турнирите, в които участва с отбора си.
Като вход ще получавате имена на турнири до получаване на команда "End of tournaments".
За всеки турнир ще получавате цяло число, което ще показва броя на мачовете, които се играят за турнир.
За всеки мач ще получавате: на първия ред точките, които е вкарал отборът на Деси, а на втория ред - точките, които е вкарал противниковият отбор.
След получаване на точките за всеки мач отпечатайте:
	Ако отборът на Деси е спечелил (т.е. точките, които е вкарал нейният отбор, са повече от точките на противниковия отбор):
"Game {кой е номерът на мача, който са изиграли за текущия турнир} of tournament {име на турнира}: win with {разликата между точките на отбора на Деси и противниковия отбор} points."
	Ако отборът на Деси е загубил (т.е. точките, които е вкарал нейният отбор, са по-малко от точките, които е вкарал противниковият отбор):
"Game {кой е номерът на мача, който са изиграли за текущия турнир} of tournament {име на турнира}: lost with {разликата между точките на противниковия отбор и отбора на Деси} points."
Няма да има случаи на равенство.
Вход
От конзолата се четат поредица от турнири до получаване на командата "End of tournaments":
•	Име на турнира – текст
•	За всеки турнир n на брой мача – цяло число в интервала [1…15]
•	За всеки мач се четат по два реда:
o	Точки, вкарани от отбора на Деси – цяло число в интервала от [0…150]
o	Точки, вкарани от противниковия отбор – цяло число в интервала от [0…150]
Изход
На конзолата да се отпечатат следните редове:
•	След всеки мач да се отпечатва дали отборът на Деси е спечелил или загубил и съответно с каква разлика.
•	При получаване на команда "End of tournaments" да се отпечатат два реда:
o	{процент спечелени мачове от всички турнири}% matches win
o	{процент загубени мачове от всички турнири}% matches lost
Всички проценти трябва да са форматирани до втората цифра след десетичния знак.*/

public class BasketballTournament {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();

        int gameCount = 0;
        int wonGames = 0;
        int lostGames = 0;
        while(!tournamentName.equals("End of tournaments")){
            String currentTournament = tournamentName;
            int numOfMatches = Integer.parseInt(scanner.nextLine());

            int matchCount = 0;
            for (int i = 1; i <= numOfMatches; i++){
                int pointsDesiTeam = Integer.parseInt(scanner.nextLine());
                int pointsOpposingTeam = Integer.parseInt(scanner.nextLine());
                gameCount++;
                matchCount++;
                int diff = Math.abs(pointsDesiTeam - pointsOpposingTeam);
                if (pointsDesiTeam > pointsOpposingTeam){
                    wonGames++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", matchCount, tournamentName, diff);
                } else {
                    lostGames++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", matchCount, tournamentName, diff);
                }
            }
            matchCount = 0;
            tournamentName = scanner.nextLine();
        }

        double percentWon = (1.0 * wonGames / gameCount) * 100;
        double percentLost = (1.0 * lostGames / gameCount) * 100;
        System.out.printf("%.2f%% matches win%n", percentWon);
        System.out.printf("%.2f%% matches lost%n", percentLost);
    }
}
