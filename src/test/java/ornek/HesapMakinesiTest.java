package ornek;

import org.junit.Assert;
import org.junit.Test;

public class HesapMakinesiTest {

    @Test
    public void testTopla() {

        // ön hazirlik - GIVEN
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        int sayi1 = 5;
        int sayi2 = 19;

        // methodu calistir - WHEN
        int toplam = hesapMakinesi.topla(sayi1, sayi2);

        // sonucu kontrol et - THEN
        Assert.assertEquals(24, toplam); // true
        //Assert.assertEquals(23, toplam); // false
    }

    // Bundan sonraki 3 method da cikar methodu icin calisiyor.
    // Methodun icerisinde hata alinca digerine devam etmeyecegi icin senaryolari ayri inceledik
    @Test
    public void testCikar () throws Exception {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        Assert.assertEquals(15, hesapMakinesi.cikar(15, 0));
    }

    @Test
    public void testSifirdanCikkincaeksiOlur () throws Exception {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        Assert.assertEquals(-15, hesapMakinesi.cikar(0, 15));
    }

    @Test
    public void testSayidansifirCikincaAyniSayiKalir () throws Exception {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        Assert.assertEquals(20, hesapMakinesi.cikar(50, 30));
    }
}
