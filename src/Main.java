import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Домашнее задание по теме «Внедрение системы контроля версий");
//        long[] resultSale = new long[3];
//        for(int i = 0; i < resultSale.length; i++) {
//            resultSale[i] = 5;
//        }
//        SalesManager salesManager = new SalesManager(resultSale);//создане объекта класса SalesManager
//        System.out.println(Arrays.toString(resultSale)); // демонстрация содержимого массива
//        System.out.println(salesManager.max());// результат использования объектом метода max
//        System.out.println();

        System.out.println("Домашнее задание по теме «История работы и ветки»");
        long[] resultSales = {5, 10, 15};
        SalesManager salesManager1 = new SalesManager(resultSales);
        System.out.println(salesManager1.max() +
                " - максимальное значение по продажам");
        System.out.println(salesManager1.averageValue() +
                " - среднее значение по продажам");//результат использования объектом метода averageValue
    }
}