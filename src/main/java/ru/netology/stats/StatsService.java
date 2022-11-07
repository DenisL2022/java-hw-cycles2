package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long totalSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public float averageSales(long[] sales) {
        return totalSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxIndex = 0;
        long max = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= max){
                maxIndex = i;
            }
        }
        return maxIndex + 1;
    }

    public int salesAboveAverage(long[] sales){
        float averageSales = averageSales(sales);
        int result = 0;
        for (long sale : sales){
            if (sale > averageSales){
                result++;
            }
        }
        return result;
    }

    public int salesBelowAverage(long[] sales){
        float averageSales = averageSales(sales);
        int result = 0;
        for (long sale : sales){
            if (sale < averageSales){
                result++;
            }
        }
        return result;
    }

}
