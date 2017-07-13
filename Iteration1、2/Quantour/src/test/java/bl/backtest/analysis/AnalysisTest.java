package bl.backtest.analysis;

import datahelper.utilities.DataFrame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vo.backtest.BacktestResultOverviewVO;
import vo.backtest.ReturnDistributionVO;
import vo.backtest.WinRateVO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kevin on 2017/4/17.
 */
class AnalysisTest {

    Analysis tested;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        File file = new File("C:\\Users\\kevin\\OneDrive - smail.nju.edu.cn\\Documents\\Study\\2017_Spring\\SE3\\Homework\\Project\\Quantour\\Src\\Quantour\\src\\main\\resources\\data\\Test\\Book2.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String[] lines = reader.lines().toArray(String[]::new);
        PortfolioValue strategy = new PortfolioValue(new DataFrame(lines, ","));

        File file1 = new File("C:\\Users\\kevin\\OneDrive - smail.nju.edu.cn\\Documents\\Study\\2017_Spring\\SE3\\Homework\\Project\\Quantour\\Src\\Quantour\\src\\main\\resources\\data\\Test\\Book3.csv");
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        String[] lines1 = reader1.lines().toArray(String[]::new);
        PortfolioValue benchmark = new PortfolioValue(new DataFrame(lines1, "\t"));
        tested = new Analysis(strategy, benchmark);
    }

    @Test
    void getOverview() {
        BacktestResultOverviewVO backtestResultOverviewVO = tested.getOverview();
    }

    @Test
    void getWinRate() {
        WinRateVO winRateVO = tested.getWinRate(5);
    }

    @Test
    void getReturnDistribution() {
        ReturnDistributionVO returnDistributionVO = tested.getReturnDistribution(5);
    }

}