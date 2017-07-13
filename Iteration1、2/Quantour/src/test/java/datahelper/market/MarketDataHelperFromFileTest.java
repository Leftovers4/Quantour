package datahelper.market;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import po.stock.StockItemPO;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by kevin on 2017/3/9.
 */
class MarketDataHelperFromFileTest {

    private MarketDataHelper marketDataHelper;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        marketDataHelper = new MarketDataHelperFromFile();
    }

    /**
     * 测试从文件中获取全部股票代码
     */
    @Test
    void findAllStockCodes() {
        List<String> codes = marketDataHelper.findAllStockCodes();
    }


}