package loops.forloop.pracitce;

import java.util.Scanner;

/*Шеф на компания забелязва че все повече служители прекарват  време в сайтове, които ги разсейват.
За да предотврати това, той въвежда изненадващи проверки на отворените табове на браузъра на служителите си.
Според отворения сайт в таба се налагат следните глоби:
•	"Facebook" -> 150 лв.
•	"Instagram" -> 100 лв.
•	"Reddit" -> 50 лв.
От конзолата се четат два реда:
•	Брой отворени табове в браузъра n - цяло число в интервала [1...10]
•	Заплата - число в интервала [500...1500]
След това n – на брой пъти се чете име на уебсайт – текст
Изход
•	Ако по време на проверката заплатата стане по-малка или равна на 0 лева, на конзолата се изписва
"You have lost your salary." и програмата приключва.
•	В противен случай след проверката на конзолата се изписва остатъкът от заплатата (да се изпише като цяло число).
*/
public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfOpenTabs = Integer.parseInt(scanner.nextLine()); //[1...10]
        double salary = Double.parseDouble(scanner.nextLine()); //[500...1500]

        boolean isValidNumTabs = numberOfOpenTabs >= 1 && numberOfOpenTabs <=10;
        boolean isValidSalary = salary >= 500 && salary <= 1500;
        boolean isValidInput = isValidNumTabs && isValidSalary;

        int countFacebook = 0;
        int countInstagram = 0;
        int countReddit = 0;

        for (int i = 1; i <= numberOfOpenTabs; i++) {
            String websiteName = scanner.nextLine();

            if (websiteName.equals("Facebook")) {
                countFacebook++;
            } else if (websiteName.equals("Instagram")) {
                countInstagram++;
            } else if (websiteName.equals("Reddit")) {
                countReddit++;
            }
        }

        double facebookFine = countFacebook * 150;
        double instagramFine = countInstagram * 100;
        double redditFine = countReddit * 50;

        double fine = facebookFine + instagramFine + redditFine;
        double salaryLeft = salary - fine;

        if ((salary - fine <= 0) && isValidInput) {
            System.out.printf("You have lost your salary.");
        } else if ((salary - fine > 0) && isValidInput){
            System.out.printf("%.0f", salaryLeft);
        }
    }
}
