package blservice.backtestblservice;

import bl.backtest.BackTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.enums.Benchmark;
import util.exception.StockNotFoundException;
import vo.backtest.BacktestResultOverviewVO;
import vo.backtest.PositionRecordVO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Hiki on 2017/4/17.
 */
class BackTestBLServiceTest {

    BackTestBLService tested;

    LocalDate beginTime = LocalDate.parse("2006-01-01");

    LocalDate endTime = LocalDate.parse("2008-01-01");

    Benchmark benchmark = Benchmark.HS300;

    String[] universeNames = {"全部股票"};

    double capitalBase = 100000.0;

    int formRate = 10;

    int refreshRate = 15;




    @BeforeEach
    void setUp() throws StockNotFoundException {
        tested = new BackTest();
    }

    @Test
    void runMomentum() throws StockNotFoundException {

        System.out.println(LocalDateTime.now());

        tested.runMomentum(beginTime, endTime, benchmark, universeNames, capitalBase, formRate, refreshRate);

        System.out.println(LocalDateTime.now());

        List<PositionRecordVO> positionRecordVOS = tested.getPositionRecord();

        System.out.println(LocalDateTime.now());

        for (PositionRecordVO positionRecordVO : positionRecordVOS) {
            System.out.println(positionRecordVO.getDate() + " " + positionRecordVO.getCapitalAll());
        }
    }

    @Test
    void runMeanRevision() throws StockNotFoundException {
        tested.runMeanRevision(beginTime, endTime, benchmark, universeNames, capitalBase, formRate, refreshRate);

        List<PositionRecordVO> positionRecordVOS = tested.getPositionRecord();

        for (PositionRecordVO positionRecordVO : positionRecordVOS) {
            System.out.println(positionRecordVO.getDate() + " " + positionRecordVO.getCapitalPresent());
        }

    }

    @Test
    void getBacktestResultOverview() {
    }

    @Test
    void getChangingWP() {
    }

    @Test
    void getReturns() {
    }

    @Test
    void getPositionRecord() {
    }

}