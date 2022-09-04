package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ornek.HesapMakinesi;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametreTest {

    private HesapMakinesi hesapMakinesi = new HesapMakinesi();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {10, 2, 20},
            {20, 2, 40},
            {5, 2, 10},
            {24, 2, 48},
            {6, 2, 12}});
    }
    private int en;
    private int boy;
    private int toplamMetreKare;

    public ParametreTest(int en, int boy, int toplamMetreKare) {
        this.en = en;
        this.boy = boy;
        this.toplamMetreKare = toplamMetreKare;
    }

    @Test
    public void testMetreKareHesapla() throws Exception {
        Assert.assertEquals(toplamMetreKare, hesapMakinesi.metreKareHesap(en, boy));
    }
}

