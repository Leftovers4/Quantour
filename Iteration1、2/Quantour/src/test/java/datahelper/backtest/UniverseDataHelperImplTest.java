package datahelper.backtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kevin on 2017/4/16.
 */
class UniverseDataHelperImplTest {

    UniverseDataHelper tested;

    @BeforeEach
    void setUp() {
        tested = new UniverseDataHelperImpl();
    }

    @Test
    void addNewUniverse() throws DuplicateName {
        List<String> codes = new ArrayList<>();
        codes.add("1");
        codes.add("2");
        tested.addUniverse("222", codes);
    }

    @Test
    void delUniverse() {
        tested.delUniverse("hahahaha");
    }

}