public class SalesManager {
    protected long[] sales;
    public SalesManager(long[] sales) {
        this.sales = sales;
    }
    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long averageValue (){   // метод расчета среднего значения
        int totalSales = 0;
        long sum = 0;
        for (int i = 0; i < sales.length; i++){
          sum = sum + sales[i];
          totalSales++;
          }
        return sum / totalSales;
    }
}