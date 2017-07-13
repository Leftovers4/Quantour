package bl.backtest.analysis;

import datahelper.utilities.DataFrame;
import datahelper.utilities.Series;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kevin on 2017/4/5.
 */
class PortfolioValueTest {

    /**
     * 被测试的对象
     */
    PortfolioValue tested;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        File file = new File("C:\\Users\\kevin\\OneDrive - smail.nju.edu.cn\\Documents\\Study\\2017_Spring\\SE3\\Homework\\Project\\Quantour\\Src\\Quantour\\src\\main\\resources\\data\\Test\\Book2.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String[] lines = reader.lines().toArray(String[]::new);
        tested = new PortfolioValue(new DataFrame(lines, ","));
    }

    /**
     * 测试获取夏普比率
     */
    @Test
    void getSharpRatio() {
        System.out.println("SharpRatio: " + tested.getSharpRatio());
    }

    /**
     * 测试获取收益波动率
     */
    @Test
    void getVolatility() {
        System.out.println("Volatility: " + tested.getVolatility());
    }

    /**
     * 测试获取年化收益率
     */
    @Test
    void getAnnualisedReturn() {
        System.out.println("Annualised Return: " + tested.getAnnualisedReturn());
    }

    /**
     * 测试获取最大回撤
     */
    @Test
    void getMaxDrawdown() {
        System.out.println("Max Drawdown: " + tested.getMaxDrawdown());
    }

    /**
     * 测试获取每日的累计收益率
     */
    @Test
    void getDailyCumReturn() {
        Series dailyCumReturn = tested.getDailyCumReturn();
    }

    /**
     * 测试获取每日的收益率
     */
    @Test
    void getDailyReturn() {
        Series dailyReturn = tested.getDailyReturn();
    }

    /**
     * 测试获取总收益
     */
    @Test
    void getTotalReturn() {
        System.out.println("Total Return: " + tested.getTotalReturn());
    }

}