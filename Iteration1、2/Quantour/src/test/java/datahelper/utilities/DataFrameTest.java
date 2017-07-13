package datahelper.utilities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kevin on 2017/4/3.
 */
class DataFrameTest {

    DataFrame tested;

    @BeforeEach
    void setUp() throws IOException {
        tested = new DataFrame(DataMirror.getInstance().getStocks().get("1"), "\t");
    }

    /**
     * 测试从DataFrame中获取某一列
     */
    @Test
    void getColumn() {
        Series column = tested.getColumn("Close");
    }

    /**
     * 测试从DataFrame中获取某一行
     */
    @Test
    void getRow() {
        Series row = tested.getRow(0).shift(1);
    }

}