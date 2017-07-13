package datahelper.backtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.enums.Benchmark;
import util.enums.Board;
import util.exception.StockHasNoDataException;
import util.exception.StockItemNotFoundException;
import util.exception.StockNotFoundException;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kevin on 2017/4/15.
 */
class BackTestDataHelperImplTest {
    @Test
    void getSectionByStockCode() {
        System.out.println(tested.getSectionByStockCode("1"));
    }

    @Test
    void find() {
    }

    @Test
    void find1() {
    }

    @Test
    void find2() {
    }

    BackTestDataHelper tested;

    @BeforeEach
    void setUp() throws StockNotFoundException {
        tested = new BackTestDataHelperImpl();
    }

    @Test
    void getStockLastPriceFromMemory() throws StockHasNoDataException, StockNotFoundException, StockItemNotFoundException {
        System.out.println(tested.getStockLastPriceFromMemory("1", LocalDate.of(2017, 1, 15)));
    }

    @Test
    void getStockPriceFromMemory() throws StockHasNoDataException, StockNotFoundException, StockItemNotFoundException {
        Arrays.stream(tested.getStockPriceFromMemory("1", LocalDate.of(2013, 10, 8), 5)).forEach(num -> System.out.println(num));
    }

    @Test
    void getListStockPriceFromMemory() {
    }

    @Test
    void getBoardStockPriceFromMemory() {
    }

    @Test
    void getSectionStockPriceFromMemory() {
    }

    @Test
    void getStockName() {
        System.out.println(tested.getStockName("1"));
    }

    @Test
    void getTradeDays() {
    }

    @Test
    void getStockCodesBySection() {
        tested.getStockCodesBySection("社会服务业").stream().forEach(System.out::println);
    }

    @Test
    void getStockCodesByUniverseName() {
        tested.getStockCodesByUniverseName("d").stream().forEach(System.out::println);
    }

    @Test
    void getStockCodesByBoard() {
        tested.getStockCodesByBoard(Board.Main_Board).stream().forEach(System.out::println);
    }

    @Test
    void getPricesByBenchmark() {
        Map<LocalDate, Double> map = tested.getPricesByBenchmark(Benchmark.HS300, LocalDate.of(2010, 5, 5), LocalDate.of(2010, 10, 1));
    }

    @Test
    void getAveragePricesByCodeList() {
        Map<LocalDate, Double> map = tested.getAveragePricesByCodeList(tested.getStockCodesBySection("房地产"), LocalDate.of(2010, 5, 5), LocalDate.of(2010, 10, 1));
    }

    @Test
    void getSections() {
        tested.getSections().stream().forEach(System.out::println);
    }

    @Test
    void getAllStockCodes() {
        tested.getAllStockCodes().stream().forEach(System.out::println);
    }

    @Test
    void getBoardStockCodes() {
    }

}