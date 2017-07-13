package bl.stock;

import util.exception.StockNotFoundException;
import util.exception.TimeException;
import org.junit.Before;
import org.junit.Test;
import vo.stock.StockVO;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Hiki on 2017/3/11.
 */
public class StockTest {

    Stock tested;

    @Before
    public void setUp(){
        tested = new Stock();
    }

    @Test
    public void findStockByName(){
        LocalDate beginTime = LocalDate.parse("2013-12-01");
        LocalDate endTime = LocalDate.parse("2014-01-01");
        try {
            StockVO stockVO = tested.findStockByName("坚瑞消防", beginTime, endTime);
            System.out.println(stockVO.change);
            System.out.println(stockVO.increase);
            System.out.println(stockVO.logReturnVariance);
            System.out.println(stockVO.presentPrice);
        } catch (StockNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (TimeException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void findStockByCode() {
        LocalDate beginTime = LocalDate.parse("2013-12-01");
        LocalDate endTime = LocalDate.parse("2014-04-01");

        try {
            StockVO stockVO = tested.findStockByCode("1", beginTime, endTime);
            System.out.println(stockVO.getStockItemList().get(0).change);
            System.out.println(stockVO.getStockItemList().get(0).increase);
            System.out.println(stockVO.getStockItemList().get(30).averages.get(30));
//            System.out.println(stockVO.change);
//            System.out.println(stockVO.increase);
//            System.out.println(stockVO.logReturnVariance);
//            System.out.println(stockVO.presentPrice);
        } catch (StockNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (TimeException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void findSuggestions(){
        try {
            List<String> result = tested.findSuggestions("哇单位");
            result.stream().forEach(s -> System.out.println(s));
        } catch (StockNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void getSections(){

        List<String> sections = tested.getSections();
        sections.forEach(System.out::println);

    }

}