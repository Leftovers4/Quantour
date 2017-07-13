package dao.backtest;

import dataservice.backtestdata.BacktestDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.exception.StockItemNotFoundException;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kevin on 2017/4/19.
 */
class BackTestDaoTest {
    @Test
    void getStockPrice1() throws StockItemNotFoundException {
        double[] prices = tested.getStockPrice("1", LocalDate.of(2014, 1, 3), 3);

        Map<String, Double[]> stringMap = tested.getListStockPrice(Arrays.asList("1", "2"),LocalDate.of(2014, 1, 3), 3);
    }

    @Test
    void getListStockPrice() {
    }

    BacktestDataService tested;

    @BeforeEach
    void setUp() {
        tested = new BackTestDao();
    }

    @Test
    void getStockPrice() throws StockItemNotFoundException {
        Arrays.stream(tested.getStockPrice("1" , LocalDate.of(2013, 7, 1), 10)).forEach(System.out::println);
    }

}