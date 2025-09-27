import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Задача 1: Чётность числа
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    //Задача 2: Максимум из трёх
    public static int max3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    //Задача 3: Модуль числа (перегрузка)
    public static int abs(int x) {
        return Math.abs(x);
    }

    //Задача 4: Безопасное деление
    public static int safeDivide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException(" Деление на ноль невозможно ");

        return a / b;
    }

    //Задача 5: Сумма массива
    public static int sum(int[] arr) {
        if (arr.length == 0) return 0;

        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    //Задача 6: Подсчёт положительных
    public static int countPositive(int[] arr) {
        if (arr == null) return 0;
        int count = 0;

        for (int a : arr) {
            if (a > 0) count++;
        }
        return count;
    }

    //Задача 7: Вар-аргс сумма
    public static long sum(long... nums) {
        if (nums.length == 0)
            System.out.println(0);
        long sum = Arrays.stream(nums).sum();
        System.out.printf("сумма - %d", sum);
        return sum;

    }

    //Задача 8: Палиндром для числа
    public static boolean isNumericPalindrome(int n) {
        if (n < 0) n *= (-1);

        int original = n;
        int reversed = 0;//123

        while (n > 0) {
            int lastCifra = n % 10;
            reversed = reversed * 10 + lastCifra;
            n = n / 10;
        }
        return original == reversed;
    }

    //Задача 14: Валидатор пароля (композиция)
    /*public static boolean hasDigit(String s) {
        boolean hasDigit = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) hasDigit = true;

        }
        if (!hasDigit) System.out.println(hasDigit + " Error. Пароль без цифр");
        else System.out.println(hasDigit + " Цифры есть");

        return hasDigit;
    }

    public static boolean hasLetter(String s) {
        boolean hasLetter = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) hasLetter = true;
        }
        if (hasLetter) System.out.println(hasLetter + " символы есть");
        else System.out.println(hasLetter + " Error. Пароль без символов");

        return hasLetter;
    }

    public static boolean hasLetterUpperCase(String s) {
        boolean hasLetterUpperCase = false;
        char[] array = s.toCharArray();
        for (char i : array) {
            if (Character.isUpperCase(i)) hasLetterUpperCase = true;
        }
        if (hasLetterUpperCase) System.out.println(hasLetterUpperCase + " Заглавные символы есть");
        else System.out.println(hasLetterUpperCase + " Error. Пароль без заглавных символов");

        return hasLetterUpperCase;
    }

    public static boolean isLongEnough(String s) {
        boolean isLongEnough = false;
        if (s.length() >= 8) {
            isLongEnough = true;
            System.out.println(isLongEnough + " Корректная длина пароля");
        } else System.out.println(isLongEnough + " Error. Короткий пароль");

        return isLongEnough;
    }*/

    public static boolean isStrongPassword(String s) {
        boolean isStrongPassword = false;

        boolean hasLetter = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) hasLetter = true;
        }


        boolean hasDigit = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) hasDigit = true;

        }


        boolean hasLetterUpperCase = false;
        char[] array = s.toCharArray();
        for (char i : array) {
            if (Character.isUpperCase(i)) hasLetterUpperCase = true;
        }


        boolean isLongEnough = false;
        if (s.length() >= 8)
            isLongEnough = true;


        if (hasDigit && hasDigit && hasLetterUpperCase && isLongEnough) {
            isStrongPassword = true;
            System.out.println(isStrongPassword + " Сильный пароль");
        } else System.out.println(" Слабый пароль");


        return isStrongPassword;
    }


    public static void main(String[] args) {
        /*System.out.println(isEven(19));

        System.out.println(max3(20, 100, 15));

        System.out.println(abs(-100));

        System.out.println(safeDivide(50, 1));

        int[] arr = {};

        System.out.println(sum(arr));*/

        /*int[] arr = new int[0];
        Random rd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(-100, 100);
            System.out.println(arr[i]);
        }

        System.out.println(countPositive(arr) + " Количество положительных чисел в массиве");*/

        /*sum(1, 2, 3, 4, 5);*/

        /*System.out.println(isNumericPalindrome(-123321));*/

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        isStrongPassword(s);
    }
}