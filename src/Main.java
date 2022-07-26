import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание по теме «История работы и ветки»");
        long[] resultSales = {5, 10, 15};
        SalesManager salesManager1 = new SalesManager(resultSales);
        //System.out.println(salesManager1.max() + " - максимальное значение по продажам");
        System.out.println(salesManager1.average() + " - среднее значение по продажам");
    }
}