package ru.netology.services.myhw3mvn;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int salesAmount(long[] sales) {
        int amount = 0;
        for (long x : sales) amount += x;

        return amount;
    }

    public long averageAmount(long[] sales) {
        int averageSum = salesAmount(sales) / sales.length;

        return averageSum;

    }

    public int numberOfMounthsMinAverageAmount(long[] sales) {
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int numberOfMounthsMaxAverageAmount(long[] sales) {
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount(sales)) {
                counter++;
            }
        }
        return counter;
    }
}



