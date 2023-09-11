import java.util.ArrayList;

public class Task {

    //Создать ArrayList
    //положить в него элементы 97, 65, 43, 102 и 11
    //удалить элемент со значение 102
    //простой вариант - просто удалить по индексу (потому, что вы визуально его можете посчитать)
    //средний вариант - не хардкодить индекс, а найти индекс через метод indexOf, а потом по этому методу удалить элемент

    //вывести на экран размер листа

    //*Найти среднее значение среди всех чисел. сумма всех чисел / кол-во чисел

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(97);
        list.add(65);
        list.add(43);
        list.add(102);
        list.add(11);

        int index = list.indexOf(102);
        list.remove(index);

        System.out.println(list);

        System.out.println(list.size());

        //сумма всех / кол-во всех

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        System.out.println(sum / list.size());

    }
}
