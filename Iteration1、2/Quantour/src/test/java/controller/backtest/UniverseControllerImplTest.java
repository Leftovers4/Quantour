package controller.backtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wyj on 2017/4/17.
 */
class UniverseControllerImplTest {

    UniverseController tested;

    @BeforeEach
    void setUp() {
        tested = new UniverseControllerImpl();
    }

    @Test
    void createNewUniverse() {
        try {
            tested.createNewUniverse("222", Arrays.asList("1", "2"));
        } catch (DuplicateName duplicateName) {
            duplicateName.printStackTrace();
        }
    }

    @Test
    void deleteUniverse() {
        tested.deleteUniverse("hghg");
    }

    @Test
    void getAllUniverses() {
    }

}