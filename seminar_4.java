import java.util.ArrayList;
import java.util.Scanner;


    //Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//вывод в формате Фамилия И.О. возраст пол
//добавить возможность выхода или вывода списка отсортированного по возрасту!)
//*реализовать сортировку по возрасту с использованием индексов
//*реализовать сортировку по возрасту и полу с использованием индексов


import com.sun.source.tree.WhileLoopTree;

import javax.sound.sampled.TargetDataLine;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

    public class seminar_4 {
        static Scanner menu = new Scanner(System.in);

        public static String GetData(String message) {
            System.out.println(message);
            return menu.nextLine();
        }

        public static void main(String[] args) {
            System.out.println("введите\nФамилию Имя Отчество возраст пол");
            ArrayList<String[]> humans = new ArrayList<>();
            while (true) {
                String a = menu.nextLine();
                if (a.equals("q")) break;
                humans.add(a.split(" "));
            }
            for (String[] i : humans) {

                System.out.printf("%s %s.%s. %s %s \n", i[0], i[1].toUpperCase().charAt(0), i[2].toUpperCase().charAt(0),
                        i[3], i[4]);
            }
            ArrayList<String> Chel = new ArrayList<>();
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> surname = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<Boolean> gender = new ArrayList<>();
            for (String[] i : humans) {
                Chel.add(i[0]);
                name.add(i[1]);
                surname.add(i[2]);
                age.add(Integer.parseInt(i[3]));
                gender.add(i[4].toLowerCase().contains("м"));

            }
            //       static void bubbleSort (List < Integer > arr) {
            int n = age.size();
            for (int i = 0; i < n - 1; i++) {
                boolean swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (age.get(j) > age.get(j + 1)) {
                        int temp = age.get(j);
                        age.set(j, age.get(j + 1));
                        age.set(j + 1, temp);
                        swapped = true;
                    }
                }
                if (!swapped) break;


            }System.out.println(age);
        }
    }
