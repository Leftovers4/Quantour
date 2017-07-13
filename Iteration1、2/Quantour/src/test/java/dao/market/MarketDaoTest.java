package dao.market;

import dataservice.market.MarketDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import po.market.MarketItemPO;
import po.stock.StockItemPO;
import util.exception.StockHasNoDataException;
import util.exception.StockNotFoundException;
import util.exception.TimeException;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kevin on 2017/3/11.
 */
class MarketDaoTest {

    private MarketDataService marketDao;

    @BeforeEach
    void setUp() {
        marketDao = new MarketDao();
    }

    /**
     * 测试从数据层获取某一天的市场条目
     *
     * @throws IOException IO异常
     */
    @Test
    void findMarketItemsByTime(){
        List<MarketItemPO> marketItemPOList = marketDao.findMarketItemsByTime(LocalDate.of(2014, 2, 13));
    }

    /**
     * 测试从数据层获取所有股票的最近交易日市场条目
     *
     * @throws IOException IO异常
     */
    @Test
    void findLatestMIsOfAllStocks() throws IOException {
        List<MarketItemPO> marketItemPOList = marketDao.findLatestMIsOfAllStocks();
    }

}