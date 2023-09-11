import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>();
        first.add("Привет");
        first.add("Даниил");
        first.add(" ");

        System.out.println(first.toString());

        String answer = first.get(1);
        System.out.println(answer);

        //first.remove(0);
        //first.remove(0);
        //first.remove(0);

        System.out.println(first);
        //capacity = 22;
        //size = 15;

        int[] a = new int[2];
        System.out.println(a.length);

        System.out.println(first.size());

        first.add(1, "Урок");

        System.out.println(first);

        first.set(1, "Уроки");

        System.out.println(first);
        System.out.println(first.contains("Привет"));
        //first.clear();
        System.out.println(first);
        int index = first.indexOf("Даниил");
        System.out.println(index);

        System.out.println(first.isEmpty());
        first.trimToSize(); //capacity - trim capacity to size

        System.out.println(first);


        //Создать ArrayList
        //положить в него элементы 97, 65, 43, 102 и 11
        //удалить элемент со значение 102
        //простой вариант - просто удалить по индексу (потому, что вы визуально его можете посчитать)
        //средний вариант - не хардкодить индекс, а найти индекс через метод indexOf, а потом по этому методу удалить элемент

        //вывести на экран размер листа

        //*Найти среднее значение среди всех чисел. сумма всех чисел / кол-во чисел

    }
}