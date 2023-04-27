/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        ArrayList<String> planetsList = createItemsList(planets, 20);
        System.out.println(planetsList);
        for (String planet : planets) {
            System.out.printf("%s\t %d\n", planet, Collections.frequency(planetsList, planet));
        }
    }

    static ArrayList<String> createItemsList(String[] items, int capacity) {
        Random rnd = new Random();
        ArrayList<String> itemsList = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            int index = rnd.nextInt(8);
            itemsList.add(items[index]);
        }
        return itemsList;
    }
}