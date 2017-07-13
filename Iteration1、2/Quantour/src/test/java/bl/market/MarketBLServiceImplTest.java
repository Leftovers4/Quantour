package bl.market;

import blservice.marketblservice.MarketBLService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vo.market.DefaultStockVO;
import vo.market.MarketVO;
import vo.stock.StockVO;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kevin on 2017/3/11.
 */
class MarketBLServiceImplTest {

    MarketBLService marketBLService;

    @BeforeEach
    void setUp() {
        marketBLService = new MarketBLServiceImpl();
    }

    /**
     * 测试获取某天的市场行情
     *
     * @throws IOException IO异常
     */
    @Test
    void getMarketInfo() throws IOException {
        MarketVO marketVO = marketBLService.getMarketInfo(LocalDate.of(2008, 3, 13));
    }

    /**
     * 测试获取市场的所有股票的默认信息
     *
     * @throws IOException IO异常
     */
    @Test
    void getAllStocks() throws IOException {
        List<DefaultStockVO> stockVOList = marketBLService.getAllStocks();
    }

}