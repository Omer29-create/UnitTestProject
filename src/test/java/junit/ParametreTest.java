package junit;

import org.junit.Assert;
import org.junit.Test;
import ornek.HesapMakinesi;

public class ParametreTest {

    private HesapMakinesi hesapMakinesi = new HesapMakinesi();

    @Test
    public void testMetreKareHesapla() throws Exception {
        Assert.assertEquals(20, hesapMakinesi.metreKareHesap(10,2));
    }
}
