package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale += sales[i];
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale += sales[i];
        }
        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int MaxSaleMonth(long[] sales) {
        int monMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monMax] <= sales[i]) {
                monMax = i;
            }

        }
        return monMax;
    }

    public int MinSaleMonth(long[] sales) {
        int monMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monMin] >= sales[i]) {
                monMin = i;
            }

        }
        return monMin;
    }

    public int salesUnderAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int salesOverAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}

