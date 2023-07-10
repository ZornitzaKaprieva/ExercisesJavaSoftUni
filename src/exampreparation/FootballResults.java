package exampreparation;

import java.util.Scanner;

/*Футболен отбор участва в благотворителен турнир. На този турнир отборът играе три мача като домакин.
Да се напише програма, която изчислява колко победи, равенства и загуби има отборът по време на турнира, спрямо резултатите от мачовете.
*Забележка: Отборът винаги е домакин, следователно първата цифра от резултата съответства на головете вкарани от него.
Вход
От конзолата се четат 3 реда:
1.	Резултат от първия мач – текст
2.	Резултат от втория мач – текст
3.	Резултат от третия мач – текст
Резултатите ще са в следния формат: "2:0", "0:1", "1:1" и т.н.
/броят голове винаги ще бъде едноцифрено число/
Изход
На конзолата да се отпечатат три реда:
•	"Team won {брой спечелени мачове} games."
•	"Team lost {брой загубени мачове} games."
•	" Drawn games: {брой равни мачове}"*/

public class FootballResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstGame = scanner.nextLine();
        String secondGame = scanner.nextLine();
        String thirdGame = scanner.nextLine();

        int won = 0;
        int lost = 0;
        int drawn = 0;

        if (firstGame.charAt(0) > firstGame.charAt(2)){
            won++;
        } else if (firstGame.charAt(0) < firstGame.charAt(2)) {
            lost++;
        } else if (firstGame.charAt(0) == firstGame.charAt(2)) {
            drawn++;
        }

        if (secondGame.charAt(0) > secondGame.charAt(2)){
            won++;
        } else if (secondGame.charAt(0) < secondGame.charAt(2)) {
            lost++;
        } else if (secondGame.charAt(0) == secondGame.charAt(2)) {
            drawn++;
        }

        if (thirdGame.charAt(0) > thirdGame.charAt(2)){
            won++;
        } else if (thirdGame.charAt(0) < thirdGame.charAt(2)) {
            lost++;
        } else if (thirdGame.charAt(0) == thirdGame.charAt(2)) {
            drawn++;
        }

        System.out.printf("Team won %d games.%n", won);
        System.out.printf("Team lost %d games.%n", lost);
        System.out.printf("Drawn games: %d%n", drawn);
    }
}
