package customer;

import customer.exception.MailServerUnavailableException;

public class BilgilendirmeService {

    public void yeniKayitMailGonder(Musteri musteri) {

        System.out.println("Mail gonderildi");
    }

    public void haftalikMailGonder() {
        throw new MailServerUnavailableException("mail hata veriyor");
    }
}
