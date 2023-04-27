/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из 
этого списка. Collections.max()*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task2 {
    
    public static void main(String[] args) {
        List<Integer> list = createList(10, 1, 10);
        System.out.println(list);
        System.out.println("Min = " + Collections.min(list));
        System.out.println("Max = " + Collections.max(list));
        System.out.println("Average = " + list.stream().mapToInt(e -> e).average().orElse((Double.NaN)));
        
    }

    static List<Integer> createList(int capacity, int min, int max){
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int)(Math.random() * (max-min+1) + min));
        }
        return result;
    }

    
}

    
