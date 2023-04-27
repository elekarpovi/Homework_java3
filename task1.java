//Пусть дан произвольный список целых чисел, удалить из него четные числа.

import java.util.ArrayList;
import java.util.List;

public class task1 {
    
    public static void main(String[] args) {
        List<Integer> list = createList(10, 1, 10);
        System.out.println(list);
        removeInteger(list);
        System.out.println(list);
    }

    static List<Integer> createList(int capacity, int min, int max){
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int)(Math.random() * (max-min+1) + min));
        }
        return result;
    }

    static void removeInteger(List list){
        for (int i = 0; i < list.size(); i++) {
            if ((int)list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    
}