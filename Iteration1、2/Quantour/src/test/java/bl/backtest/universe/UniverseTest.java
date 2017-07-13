package bl.backtest.universe;

import blservice.backtestblservice.UniverseBLService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;
import util.exception.StockNotFoundException;
import vo.backtest.UniverseVO;
import vo.stock.StockAttributesVO;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kevin on 2017/4/16.
 */
class UniverseTest {

    UniverseBLService tested;

    @BeforeEach
    void setUp() {
        tested = new Universe();
    }

    @Test
    void createNewUniverse() throws DuplicateName {
        tested.createNewUniverse("hghg", Arrays.asList("1", "2", "3", "4"));
    }

    @Test
    void deleteUniverse() {
        tested.deleteUniverse("wodegupiaochi");
    }

    @Test
    void getAllUniverses() {
        List<UniverseVO> universeVOS = tested.getAllUniverses();
    }

    @Test
    void getStockAttributes() {
        try {
            StockAttributesVO stockAttributesVO = tested.getStockAttributes("万科A");
        } catch (StockNotFoundException e) {
            e.printStackTrace();
        }
    }

}