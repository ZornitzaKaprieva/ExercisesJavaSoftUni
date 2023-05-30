package loops.forloop.pracitce;

/*Напишете програма, която отпечатва числата в диапазона от 1 до 1000, които завършват на 7.*/
public class P01NumbersEndingIn7 {
    public static void main(String[] args) {

        //solution 1:
        for (int i = 7; i <= 997; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }

//        //solution 2:
////        for (int i = 7; i <= 997; i += 10) { //така отпада нуждата от if
////                System.out.println(i);
////            }
        }
    }
