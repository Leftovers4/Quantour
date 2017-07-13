package util.tool;

import datahelper.utilities.FileOpener;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.exception.StockNotFoundException;

import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Created by kevin on 2017/4/2.
 */
class FileOpenerTest {

    FileOpener fileOpener;

    @BeforeEach
    void setUp() {
        fileOpener = new FileOpener();
    }

    @Test
    void openStockFileAsIS() throws StockNotFoundException {
        InputStream is = fileOpener.openStockFileAsIS("-1");
    }

    @Test
    void openStockFileAsBR() throws StockNotFoundException {
        BufferedReader br = fileOpener.openStockFileAsBR("-1");
    }

}