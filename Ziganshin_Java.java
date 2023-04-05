import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ziganshin_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mode = 0;
        do{
            System.out.println("Чтобы выбрать задание, введите: 1, 2 или 3");
            try{
                mode = scanner.nextInt();

            }catch (InputMismatchException ignored){

            }
            finally {
                scanner.nextLine();
            }
        }
        while (mode != 1 && mode != 2 && mode != 3);
        switch (mode){
            case(1):{
                task1();
                break;
            }
            case(2):{
                task2();
                break;
            }
            case(3):{
                task3();
                break;
            }
        }

    }


    private static void task1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num;
        try {
            num = in.nextInt();
        }catch (InputMismatchException ignored){
            System.out.println("Некорректный ввод");
            return;
        }
        if (num > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше или равно семи");
        }
    }



    private static void task2(){
        System.out.print("Введите имя: ");
        String str = System.console().readLine();
        if(str.equals("Вячеслав")){
            System.out.print("Привет, Вячеслав");
        }
        else {
            System.out.print("Нет такого имени");
        }
    }
    private static void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива через пробел(пример: 6 4 4 99): ");
        String[] strNumbers = scanner.nextLine().split(" ");
        Integer[] numbers = new Integer[strNumbers.length];
        try {
            for (int i = 0; i < strNumbers.length; i++) {
                numbers[i] = Integer.parseInt(strNumbers[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Недопустимые значения! Работа завершена");
            return;
        }
        filter(numbers);
    }
    private static void filter(Integer[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
                ++i;
            }
        }
        System.out.println(i > 0 ? "" : "Значений подходящих под условие не обнаружено");
    }
}





