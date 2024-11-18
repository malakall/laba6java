import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        String filePath = "test.txt";
        File file = new File(filePath);

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+"); 
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); // есдт слово не пустое оно добавляется в коллекцию (есди втретилось первый раз то деволтное значение если нет то +1)
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("ошибка" + e.getMessage());
        }

        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet()); // список из элементов Map

        
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue())); // сортируем список по убванию при помощи лямбда выражений

        
        System.out.println("Топ-10 самых часто встречающихся слов:");
        for (int i = 0; i < Math.min(10, list.size()); i++) {
            System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
        }
    }
}
