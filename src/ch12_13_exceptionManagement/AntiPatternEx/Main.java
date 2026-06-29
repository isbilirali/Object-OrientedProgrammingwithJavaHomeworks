package ch12_13_exceptionManagement.AntiPatternEx;

/*
8. Aşağıdaki örnek kodda 4 farklı sıra dışı durum anti-patternı vardır.
Bunları bulup kodu nasıl daha sağlı hale getireceğinizi tartışın.
 */

public class Main {


/* ORNEK KOD*******************************************************
    public int parseAndDivide(String a, String b) {
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            return x / y;
        } catch (Exception e) {
            // do nothing
        }
        return 0;
    }
 **************************************************************** */

/*
Anti-pattern 1: Pokémon Exception Handling -> tüm exceptionlar Excepton olarak kabul ediliyor , genelleştirme-özelleştirme problemi yaşanıyor.
Anti-pattern 2: Swallowing -> yakalanan istisna yok sayılıyor. handle edilmiyor.loglama yok.kulanıcıdan feedback isteme yok
Anti-pattern 3: Anlamlısız varsayılan dönüş değeri -> 0 başarılı bir işlemin sonucu mu yoksa error flag mı???!
Anti-pattern 4: Tek catch ile farklı hataları karıştırmak -> farklı hatalar farklı catchler içinde farklı handle edilmeli

----myNotes---
->girdi hatası olabilir - x ve y'den ayrı ayrı NumberFormatException fırlatılabilir - String'e parse edilmeyebilir.
->çıktı hatası olabilir - y'nin 0 olma durumu ArithmeticException fırlatabilir.
->geri dönüş değeri mantık barındırmıyor.
->tüm exception türleri tek catch ile Exception olarak yakalanmaya çalışılıyor.
->Exception fırlatılırsa gireceği catch içinde handle edilmeyecek , sadece yok sayılacak!
 */


//nasıl olmalıydı :

    public int parseAndDivide(String a, String b) throws NumberFormatException, ArithmeticException {
        int x, y;

        try {
            x = Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.err.println("'a' parametresi sayıya çevrilemedi: " + a);
            throw e;
        }

        try {
            y = Integer.parseInt(b);
        } catch (NumberFormatException e) {
            System.err.println("'b' parametresi sayıya çevrilemedi: " + b);
            throw e;
        }

        if (y == 0) {
            throw new ArithmeticException("Bölen sıfır olamaz bro.");
        }

        return x / y;
    }
}