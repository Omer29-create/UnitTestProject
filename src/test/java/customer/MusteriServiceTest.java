package customer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MusteriServiceTest {

    private MusteriRepositoryStub musteriRepository = new MusteriRepositoryStub();

    private MusteriService musteriService;

    private  BilgilendirmeService bilgilendirmeService;

    @Before
    public void setUp() throws Exception {
        musteriService = new MusteriService();
        // musteriRepository = Mockito.mock(MusteriRepository.class);
        bilgilendirmeService = Mockito.mock(BilgilendirmeService.class);
        musteriService.setMusteriRepository(musteriRepository);
        musteriService.setBilgilendirmeService(bilgilendirmeService);
    }

    @Test
    public void testMusteriKaydet () {
        Musteri musteri = new Musteri(1234);

        musteriService.musteriKaydet(musteri);

        // Mockito.verify(musteriRepository).kaydet(musteri);
        //Assert.assertNotNull(musteriRepository.bul(musteri.getId()));
        Assert.assertEquals(musteri, musteriRepository.bul(musteri.getId()));

        Mockito.verify(bilgilendirmeService).yeniKayitMailGonder(musteri);

    }

    @Test
    public void testMusteriSil() throws Exception {

        // Assert.assertNotNull(musteriRepository.bul(1234)); // Bu id'ye sahip musteri var mi diye bakiyoruz

        musteriService.musteriKaydet(new Musteri(1234));

        musteriService.musteriSil(1234);

        Assert.assertNull(musteriRepository.bul(1234));
    }
}
