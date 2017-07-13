package datahelper.stock;

import util.exception.StockNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import po.stock.StockItemPO;
import po.stock.StockPO;

import java.time.LocalDate;
import java.util.Map;

/**
 * Created by Hiki on 2017/3/9.
 */
class StockDataHelperImplTest {

    StockDataHelperImpl tested;

    @BeforeEach
    void setUp() {
        tested = new StockDataHelperImpl();
    }

    @Test
    void findStockPOByCodeFromCsv() {
        String code = "121353253";
        LocalDate beginTime = LocalDate.parse("2005-02-01");
        LocalDate endTime = LocalDate.parse("2014-04-29");
        try {
            StockPO stockPO = tested.findStockPOByCodeFromCsv(code);
            StockItemPO stockItemPO = stockPO.getStockItemList().get(0);
            System.out.print(stockItemPO.getSerial() + "\t");
            System.out.print(stockItemPO.getDate() + "\t");
            System.out.print(stockItemPO.getOpen() + "\t");
            System.out.print(stockItemPO.getHigh() + "\t");
            System.out.print(stockItemPO.getLow() + "\t");
            System.out.print(stockItemPO.getClose() + "\t");
            System.out.print(stockItemPO.getVolume() + "\t");
            System.out.print(stockItemPO.getAdjClose() + "\t");
            System.out.print(stockItemPO.getCode() + "\t");
            System.out.print(stockItemPO.getName() + "\t");
            System.out.println(stockItemPO.getMarket());
        } catch (StockNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void findStockPOByNameFromCsv() {
        String name = "ST中冠A";
        LocalDate beginTime = LocalDate.parse("2005-02-01");
        LocalDate endTime = LocalDate.parse("2014-04-29");
        try {
            StockPO stockPO = tested.findStockPOByNameFromCsv(name);
            StockItemPO stockItemPO = stockPO.getStockItemList().get(0);
            System.out.print(stockItemPO.getSerial() + "\t");
            System.out.print(stockItemPO.getDate() + "\t");
            System.out.print(stockItemPO.getOpen() + "\t");
            System.out.print(stockItemPO.getHigh() + "\t");
            System.out.print(stockItemPO.getLow() + "\t");
            System.out.print(stockItemPO.getClose() + "\t");
            System.out.print(stockItemPO.getVolume() + "\t");
            System.out.print(stockItemPO.getAdjClose() + "\t");
            System.out.print(stockItemPO.getCode() + "\t");
            System.out.print(stockItemPO.getName() + "\t");
            System.out.println(stockItemPO.getMarket());

        } catch (StockNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void findStockPOByNameFromCsv2() {
        String name = "ST中冠A";
        LocalDate beginTime = LocalDate.parse("2005-02-01");
        LocalDate endTime = LocalDate.parse("2014-04-29");
        try {
            StockPO stockPO = tested.findStockPOByNameFromCsv(name);
            StockItemPO stockItemPO = stockPO.getStockItemList().get(0);
            System.out.print(stockItemPO.getSerial() + "\t");

        } catch (StockNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void findCodeByNameFromTxt(String name) {
        String name1 = "ST中冠A";
        try {
            System.out.println(tested.findCodeByNameFromTxt(name1));
        } catch (StockNotFoundException e) {
            e.printStackTrace();

        }

    }

    @Test
    void findCodeNameFromTxt(){
        try {
            Map<String, String> code_name = tested.findCodeNameFromTxt();
            code_name.keySet().stream().forEach(code -> System.out.println(code));
            code_name.values().stream().forEach(name -> System.out.println(name));
        } catch (StockNotFoundException e) {
            e.printStackTrace();
        }
    }

}