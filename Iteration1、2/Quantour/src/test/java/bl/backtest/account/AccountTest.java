package bl.backtest.account;

import dao.backtest.BackTestDao;
import dataservice.backtestdata.BacktestDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.enums.Board;
import util.exception.StockNotFoundException;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    /**
     * Created by Hiki on 2017/4/16.
     */

    private Account account;

    private LocalDate date = LocalDate.parse("2014-01-21");

    @BeforeEach
    void setUp() {

        double capitalBase = 100000.0;
        BacktestDataService bs = new BackTestDao();
        List<String> universe = bs.getStockCodesByBoard(Board.Main_Board);

        try {
            account = new Account(capitalBase, universe);
        } catch (StockNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void order_to() {
    }

    @Test
    void appendLog() {
    }

    @Test
    void getCapitalAvailable() {
    }

    @Test
    void getCapitalAll() {
    }

    @Test
    void getSuspendedStockNum() {
    }

    @Test
    void getStockHoldingList() {
    }

    @Test
    void isLimitUp() {
        boolean limit = account.isLimitUp("1", date);
        System.out.println(limit);
    }

//    @Test
//    void isSuspended() {
//        boolean suspended = account.isSuspended("1", date);
//        System.out.println(suspended);
//    }
//
//    @Test
//    void isLimitDown() {
//        boolean limit = account.isLimitDown("1", date);
//        System.out.println(limit);
//    }
//
//    @Test
//    void isSTStock() {
//        boolean st = account.isSTStock("30");
//        assertTrue(st);
//    }

//    @Test
//    void isInStockHoldings() {
//        System.out.println(account.isInStockHoldings("1"));
//        assertFalse(account.isInStockHoldings("1"));
//        assertFalse(account.isInStockHoldings("300091"));
//        assertFalse(account.isInStockHoldings("300198"));
//    }

//    @Test
//    void canTrade() {
//        System.out.println(account.canTrade("1", 5, date));
//    }
//
//    @Test
//    void tradeAction() {
//
//    }
//
//    @Test
//    void updateStockHoldings() {
//
//    }
//
//    @Test
//    void getStockPresentPrice() {
//    }
//
//    @Test
//    void getStockNumInUniverse() {
//    }

}