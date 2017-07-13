package util.tool;

import org.junit.Test;

/**
 * Created by kevin on 2017/3/11.
 */
public class NumberFormatterTest {

    @Test
    public void formatToScientific() throws Exception {
        System.out.println(NumberFormatter.formatToScientific(0.00001));
    }

    @Test
    public void format() throws Exception {
        System.out.println(NumberFormatter.format(0.2));
    }

    @Test
    public void formatToBaseWan() throws Exception {
        System.out.println(Math.pow(2, 30));
        System.out.println(NumberFormatter.formatToBaseWan(Math.pow(2, 30)));
    }

    @Test
    public void formatToPercent() throws Exception {
        System.out.println(NumberFormatter.formatToPercent(-0.0566666));
    }

}