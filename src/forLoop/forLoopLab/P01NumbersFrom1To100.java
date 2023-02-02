package forLoop.forLoopLab;

/*Напишете програма, която отпечатва числата от 1 до 100, всяко на нов ред.*/

public class P01NumbersFrom1To100 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i += 1) { //в случая i+=1; i++; и ++i водят до един и същи резултат, но по принцип !(i++ == ++i)
            System.out.println(i);
        }
    }
}
