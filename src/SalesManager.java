public class SalesManager {
    protected int[] sales;
    protected int sum;
    public SalesManager(int[] sales) {
        this.sales = sales;
    }
    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int averageValue (){   // метод расчета среднего значения
        sum = 0;
        int totalSales = 0;
        for (int i = 0; i < sales.length; i++){
          sum = sum + sales[i];
          totalSales++;
          }
        return sum / totalSales;
    }
}