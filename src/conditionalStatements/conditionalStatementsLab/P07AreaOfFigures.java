package conditionalStatements.conditionalStatementsLab;


import java.util.Scanner;

/* Да се напише програма, в която потребителят въвежда вида и размерите на геометрична фигура и пресмята лицето й.
Фигурите са четири вида: квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle).
На първия ред на входа се чете вида на фигурата
(текст със следните възможности: square, rectangle, circle или triangle).
•	Ако фигурата е квадрат (square):
на следващия ред се чете едно дробно число - дължина на страната му
•	Ако фигурата е правоъгълник (rectangle):
на следващите два реда четат две дробни числа - дължините на страните му
•	Ако фигурата е кръг (circle):
на следващия ред чете едно дробно число - радиусът на кръга
•	Ако фигурата е триъгълник (triangle):
на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към нея
Резултатът да се закръгли до 3 цифри след десетичната запетая.
*/
public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        switch (figure) {
            case "square": {
                System.out.println("square");
                if (figure.equals("square")) {
                    double sideSquare = Double.parseDouble(scanner.nextLine());
                    double area = sideSquare * sideSquare; //важи само за този иф
                    System.out.printf("%.3f", area);
                }
                break;
            }
            case "rectangle": {
                System.out.println("rectangle");
                if (figure.equals("rectangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            double area = side1 * side2;
            System.out.printf("%.3f", area);
                }
                break;
            }
            case "circle": {
                System.out.println("circle");
                if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * (radius*radius);
            System.out.printf("%.3f", area);
        }
                break;
            }
            case "triangle": {
                System.out.println("triangle");
                if (figure.equals("triangle")) {
            double sideT1 = Double.parseDouble(scanner.nextLine());
            double sideT2 = Double.parseDouble(scanner.nextLine());
            double area = (sideT1*sideT2)/2;
            System.out.printf("%.3f", area);
        }
                break;

            }
        }
    }
}
