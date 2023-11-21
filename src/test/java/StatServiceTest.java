import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.myhw3mvn.StatsService;

public class StatServiceTest {
    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        long actualMounth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMounth);
        System.out.println("Номер месяца, в котором был минимум продаж:" + service.minSales(sales));

    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        long actualMounth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMounth);
        System.out.println("Номер месяца, в котором был максимум продаж:" + service.maxSales(sales));

    }

    @Test
    public void testSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.salesAmount(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
        System.out.println("Сумма всех продаж:" + service.salesAmount(sales));
    }

    @Test
    public void testAverageAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 15;
        long actualAmount = service.averageAmount(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
        System.out.println("Средняя сумма продаж в месяц:" + service.averageAmount(sales));

    }

    @Test
    public void testNumberOfMounthsMinAverageAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        long actualMounths = service.numberOfMounthsMinAverageAmount(sales);

        Assertions.assertEquals(expectedMonths, actualMounths);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего:" + service.numberOfMounthsMinAverageAmount(sales));
    }

    @Test
    public void testNumberOfMounthsMaxAverageAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        long actualMounths = service.numberOfMounthsMaxAverageAmount(sales);

        Assertions.assertEquals(expectedMonths, actualMounths);
        System.out.println("Количество месяцев, в которых продажи были выше среднего:" + service.numberOfMounthsMaxAverageAmount(sales));
    }

}
