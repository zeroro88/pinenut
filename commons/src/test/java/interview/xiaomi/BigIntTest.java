package interview.xiaomi;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by why on 2017/5/18.
 */
public class BigIntTest {

    @Test
    public void test(){
//        String val = "+18927348347389543834934878";
//        BigInt bigInt = new BigInt(val);
//
//        System.out.println(val);
//        System.out.println(bigInt);

        BigInt a = new BigInt("18927348347389543834934878");
        BigInt b = new BigInt("-2");
        System.out.println(a.add(b));
//        System.out.println(a);
//        System.out.println(b);

        int[] add = a.add(new int[]{236}, new int[]{1100});
        System.out.println(Arrays.toString(add));

        int[] one = new int[]{189273483, 473895438, 34934880};
        int[] two = new int[]{473895438, 34934882};
        int[] subtract = a.subtract(one,two);
    }

    @Test
    public void addTest(){
//        18927348347389543834934878
//        18927348347389543834934878
        BigInt a = new BigInt("-18927348347389543834934878");
        System.out.println(a.toString());
        BigInt b = new BigInt("2");
        System.out.println(b);
        System.out.println(a.add(b));
    }

}