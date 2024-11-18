public class Main3 {
    public static void main(String[] args) {
        SalesTracker salesTracker = new SalesTracker();

        // Добавляем проданные товары
        salesTracker.addProduct(new Product("Яблоко", 1.5));
        salesTracker.addProduct(new Product("Банан", 1.2));
        salesTracker.addProduct(new Product("Яблоко", 1.5));
        salesTracker.addProduct(new Product("Молоко", 2.3));
        salesTracker.addProduct(new Product("Банан", 1.2));

        // Вывод списка проданных товаров
        salesTracker.showSoldProducts();

        // Подсчет общей суммы продаж
        System.out.println("Общая сумма продаж: " + salesTracker.getTotalSales());

        // Определение наиболее популярного товара
        System.out.println(salesTracker.getMostPopularProduct());
    }
}
