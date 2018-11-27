package com.company;
import java.util.Scanner;
 class Cycles {
        private Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            //Example_1();
            //Example_7();
            Example_8();
            // Example_9();
        }
        private  void Example_1() {
            double result1, result2, result3;
            int x;
            System.out.print("Введите начальную точку а: ");
            int a = scanner.nextInt();
            System.out.print("Введите конечную точку  b: ");
            int b = scanner.nextInt();
            System.out.println("Введите шаг h: ");
            int h = scanner.nextInt();
            for (x = a; x < b; x = x + h) {
                result1 = x - Math.sin(x);
                System.out.println("F(" + x + ")= " + result1);
            }
            System.out.println("__________________");
            for (x = a; x < b; x = x + h) {
                result2 = Math.pow(Math.sin(x), 2);
                System.out.println("F(" + x + ")= " + result2);
            }
            System.out.println("__________________");
            for (x = a; x < b; x = x + h) {
                result3 = 2 * Math.cos(x) - 1;
                System.out.println("F(" + x + ")= " + result3);
            }
        }

        private  void Example_7() {
            int a = 1000, counter = 0, i = 0;
            for (i = 0; i < a; i = i + 1) {
                if (i % 19 == 0 && i > 100)
                    System.out.print(" " + i);
                if (i % 19 == 0 && i > 100)
                    counter++;
                if (counter >= 15)
                    break;
            }
        }
        private static void Example_8() {
            int a = 1000, counter = 0, i = 0;
            for (i = 0; i < a; i = i + 1) {
                if ((i % 13 == 0) || (i % 17 == 0))
                    if (i > 500)
                        System.out.print(" " + i);
                if ((i % 13 == 0) || (i % 17 == 0))
                    if (i > 500)
                        counter++;
                if (counter >= 20) {
                    break;
                }
            }
        }


}
