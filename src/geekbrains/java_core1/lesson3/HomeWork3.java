package geekbrains.java_core1.lesson3;

import com.sun.deploy.security.SelectableSecurityManager;


import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
//1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
private static void gameRandomNumber(int count, int range) {
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();
    int number = random.nextInt(range);
    //int count;
    //System.out.println("Угадайте число от 0 до " + range + " за " + count + " попыток");
    boolean flag;
    int x=count;
    do {
        System.out.println("Угадайте число от 0 до " + range + " за " + count + " попыток");
        while (count != 0) {
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали");
                count = 0;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
                count -= 1;
                System.out.println("Осталось попыток " + count);
            } else {
                System.out.println("Загаданное число больше");
                count -= 1;
                System.out.println("Осталось попыток " + count);
            }
        }

        System.out.println("Сыграем еще?");
        System.out.println("1.Да");
        System.out.println("2.Нет");
        int otvet = scanner.nextInt();
        if (otvet==1) {count=x;flag=true;}
       else flag=false;
    } while (flag);
}


//2. * Создать массив из слов
//String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
// "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
// "pepper", "pineapple", "pumpkin", "potato"}.
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
// сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
// Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно можно пользоваться:
//String str = "apple";
//char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово.
//Используем только маленькие буквы.

    private static void gameWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        String pc_word = words[random.nextInt(words.length - 1)];
        System.out.println(pc_word);
        String shadow_result = pc_word;
        System.out.println("Попробуй угадать слово");
        Scanner scanner = new Scanner(System.in);
        String mask="###############";
        while (true) {
            String user_word = scanner.next();

            if (pc_word.equals(user_word)) {
                System.out.printf("Удача");
                break;
            } else {
                user_word=user_word+mask;
                shadow_result="";
                for (int i = 0; i < pc_word.length() ; i++) {
                    if (pc_word.charAt(i) == user_word.charAt(i)) {
                        shadow_result += pc_word.charAt(i) ;
                                          }
           else
                   shadow_result+="#";
                }
                System.out.println("Угаданы следующие буквы " + shadow_result+mask);
                System.out.println("Пробуйте еще");
            }

        }
    }




    public static void main(String[] args) {
       gameRandomNumber(3,15);
        gameWord();
    }

}
