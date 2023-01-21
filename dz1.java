import java.util.Arrays;
import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        task4();
    }

    static void task1(){
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res = res + i;
        }
        System.out.println(res);
        //System.out.printf("Сумма от 1 до %num = %res \n", num, res); почему-то не работает
    }
    static void task2(){
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 2;  
        if(num != 1 & num != 2){
            for (int i = 3; i <= num; i++) {
                res = res * i;
                if(i == num){
                    System.out.println(res);
                }
            }
        }else if(num == 1){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }
    static void task3(){
        int[] arr = new int[168];
        int index = 0;
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
                if (j == i) {
                    if (count == 1) {
                        arr[index] = i;
                        index++;
                    }
                    count = 0;
                    
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void task4(){
        Scanner scanner = new Scanner(System.in);
        double res = 0;
        System.out.println("Введите первое число ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число ");
        double num2 = scanner.nextDouble();
        System.out.println("Введите знак(+ - * /) ");
        char sign;

        if (scanner.hasNext()) {
            sign = scanner.next().charAt(0);
            switch (sign){
                case '+':
                    res = num1+num2;
                    break;
                case '-':
                    res = num1-num2;
                    break;
                case '*':
                    res = num1*num2;
                    break;
                case '/':
                    res = num1/num2;
                    break;
            }
            System.out.println(res);
        }
        
    }
}
