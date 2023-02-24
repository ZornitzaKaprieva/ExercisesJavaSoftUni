package nested.loops.lab;

/*Отпечатайте на конзолата таблицата за умножение за числата от 1 до 10 във формат:
"{първи множител} * {втори множител} = {резултат}".
*/
public class P02MultiplicationTable {
    public static void main(String[] args) {

        for (int m1 = 1; m1 <= 10; m1++) {
            for (int m2 = 1; m2 <= 10; m2++) {
                int result = m1 * m2;
                System.out.printf("%d * %d = %d\n", m1, m2, result);
            }

        }
    }
}
