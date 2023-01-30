package conditionalStatementsAdvanced.conditionalStatementsAdvancedLab;


import java.util.Scanner;

/*Да се напише програма, която чете име на продукт, въведено от потребителя и проверява дали е плод или зеленчук.
•	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
•	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
•	Всички останали са "unknown"
Да се изведе "fruit", "vegetable" или "unknown" според въведения продукт.
*/
public class P09FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        switch (product){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break; //ако няма break, за cucumber ще принтира и vegetable, и unknown
            default:
                System.out.println("unknown");
        }


    }
}
