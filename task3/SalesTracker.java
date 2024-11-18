import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesTracker {
    private ArrayList<Product> soldProducts; // Список проданных товаров

    // Конструктор
    public SalesTracker() {
        soldProducts = new ArrayList<>();
    }

    // Метод для добавления проданного товара
    public void addProduct(Product product) {
        soldProducts.add(product);
    }

    // Метод для вывода списка проданных товаров
    public void showSoldProducts() {
        if (soldProducts.isEmpty()) {
            System.out.println("Проданных товаров нет.");
        } else {
            System.out.println("Список проданных товаров:");
            for (int i = 0 ; i < soldProducts.size(); i++) {
                System.out.println(soldProducts.get(i));
            }
        }
    }

    // Метод для подсчета общей суммы продаж
    public double getTotalSales() {
        double totalSales = 0;
        for (int i = 0; i < soldProducts.size(); i++) {
            totalSales += soldProducts.get(i).getPrice();
        }
        return totalSales;
    }

    // Метод для определения наиболее популярного товара
    public String getMostPopularProduct() {
        if (soldProducts.isEmpty()) {
            return "Проданных товаров нет.";
        }

        HashMap<String, Integer> productCount = new HashMap<>();
        for (int i = 0; i < soldProducts.size(); i++) {
            Product product = soldProducts.get(i);
            productCount.put(product.getName(), productCount.getOrDefault(product.getName(), 0) + 1);
        }

        String mostPopular = null;
        int maxCount = 0;
        List<String> keys = new ArrayList<>(productCount.keySet());
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            int count = productCount.get(key);
            if (count > maxCount) {
                mostPopular = key;
                maxCount = count;
            }
        }


        return mostPopular != null ? "Наиболее популярный товар: " + mostPopular : "Нет данных для определения.";
    }
}