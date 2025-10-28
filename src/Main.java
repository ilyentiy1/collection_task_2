import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //инициализация фильтров
        Filter<Integer> intFilter = new IntFilter();
        Filter<String> strFilter = new StringFilter();
        Filter<Double> doubleFilter = new DoubleFilter();
        Filter<Character> charFilter = new CharFilter();

        //инициализация массивов разного типа
        String[] words = {"apple", "banana", "cat"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        Double[] doubleNumbers = {1.4, 2.5, 3.7, 4.9, 5.2};
        Character[] characters = {'a', 'b', 'e', 'm', 'x'};

        //фильтрация целочисленного массива
        System.out.println(Arrays.toString(filter(numbers, intFilter))); // [2, 4, 6, 8, 10]

        //фильтрация строкового массива
        System.out.println(Arrays.toString(filter(words, strFilter))); // [APPLE, BANANA, CAT]

        //фильтрация массива чисел с плавающей точкой
        System.out.println(Arrays.toString(filter(doubleNumbers, doubleFilter)));

        //фильтрация массива символов
        System.out.println(Arrays.toString(filter(characters, charFilter)));

    }

    public static <T> T[] filter(T[] array, Filter<T> filter) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filter.apply(array[i]);
        }
        return array;
    }
}
