import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //инициализация фильтров
        Filter<Integer> intFilter = o -> (int) Math.pow(o, 2);

        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(filter(numbers, intFilter)));

    }

    public static <T> T[] filter(T[] array, Filter<T> filter) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filter.apply(array[i]);
        }
        return array;
    }
}
