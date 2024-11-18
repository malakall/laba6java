public class Main3 {
    public static void main(String[] args) {
        SalesTracker salesTracker = new SalesTracker();

        salesTracker.addProduct(new Product("Яблоко", 150));
        salesTracker.addProduct(new Product("Банан", 120));
        salesTracker.addProduct(new Product("Яблоко", 150));
        salesTracker.addProduct(new Product("Молоко", 220));

        salesTracker.showSoldProducts();
        System.out.println("Общая сумма продаж: " + salesTracker.getTotalSales());


        System.out.println("наиболее популярный2 : " + salesTracker.getMostPopularProduct());
    }
}
