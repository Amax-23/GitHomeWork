import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long[] resultSale = new long[3];
        for(int i = 0; i < resultSale.length; i++) {
            resultSale[i] = 5;
        }
        SalesManager salesManager = new SalesManager(resultSale);//создане объекта класса SalesManager
        System.out.println(Arrays.toString(resultSale)); // демонстрация содержимого массива
        System.out.println(salesManager.max());// результат использования объектом метода max


    }
}