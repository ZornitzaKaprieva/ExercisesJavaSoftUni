package conditional.statements.advanced.lab;

import java.util.Scanner;

/*Предприемчив българин отваря квартални магазинчета в няколко града и продава на различни цени:
град / продукт
        coffee	water	beer	sweets	peanuts
Sofia	0.50	0.80	1.20	1.45	1.60
Plovdiv	0.40	0.70	1.15	1.30	1.50
Varna	0.45	0.70	1.10	1.35	1.55
Напишете програма, която чете продукт (низ), град (низ) и количество (десетично число), въведени от потребителя
и пресмята и отпечатва колко струва съответното количество от избрания продукт в посочения град.
*/
public class P05SmallShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());


        //solution 1: switch:

        switch (product){
            case "coffee":

            if (city.equals("Sofia")) {
                System.out.println(quantity * 0.5);
            } else if (city.equals("Plovdiv")) {
                System.out.println(quantity * 0.4);
            } else if (city.equals("Varna")) {
                System.out.println(quantity * 0.45);
            }
                break;

            case "water":
                if (city.equals("Sofia")) {
                    System.out.println(quantity * 0.8);
                } else if (city.equals("Plovdiv")) {
                    System.out.println(quantity * 0.7);
                } else if (city.equals("Varna")) {
                    System.out.println(quantity * 0.7);
                }

                break;

            case "beer":
                if (city.equals("Sofia")) {
                    System.out.println(quantity * 1.2);
                } else if (city.equals("Plovdiv")) {
                    System.out.println(quantity * 1.15);
                } else if (city.equals("Varna")) {
                    System.out.println(quantity * 1.1);
                }

                break;

            case "sweets":
                if (city.equals("Sofia")) {
                    System.out.println(quantity * 1.45);
                } else if (city.equals("Plovdiv")) {
                    System.out.println(quantity * 1.30);
                } else if (city.equals("Varna")) {
                    System.out.println(quantity * 1.35);
                }

                break;

            case "peanuts":
                if (city.equals("Sofia")) {
                    System.out.println(quantity * 1.6);
                } else if (city.equals("Plovdiv")) {
                    System.out.println(quantity * 1.5);
                } else if (city.equals("Varna")) {
                    System.out.println(quantity * 1.55);
                }
                break;
        }

        //solution 2: вложено if:

        double price = 0;

        if (product.equals("coffee")) {

            if (city.equals("Sofia")) {
                price = quantity * 0.5;
            } else if (city.equals("Plovdiv")) {
                price = quantity * 0.4;
            } else if (city.equals("Varna")) {
                price = quantity * 0.45;
            }

        } else if (product.equals("water")) {

            if (city.equals("Sofia")) {
                price = quantity * 0.8;;
            } else if (city.equals("Plovdiv")) {
                price = quantity * 0.7;
            } else if (city.equals("Varna")) {
                price = quantity * 0.7;
            }

        } else if (product.equals("beer")) {

            if (city.equals("Sofia")) {
                price = quantity * 1.2;
            } else if (city.equals("Plovdiv")) {
                price = quantity * 1.15;
            } else if (city.equals("Varna")) {
                price = quantity * 1.1;
            }

        } else if (product.equals("sweets")) {

            if (city.equals("Sofia")) {
                price = quantity * 1.45;
            } else if (city.equals("Plovdiv")) {
                price = quantity * 1.30;
            } else if (city.equals("Varna")) {
                price = quantity * 1.35;
            }

        } else if (product.equals("peanuts")) {

            if (city.equals("Sofia")) {
                price = quantity * 1.6;
            } else if (city.equals("Plovdiv")) {
                price = quantity * 1.5;
            } else if (city.equals("Varna")) {
                price = quantity * 1.55;
            }
        }

        System.out.println(price);

    }
}
