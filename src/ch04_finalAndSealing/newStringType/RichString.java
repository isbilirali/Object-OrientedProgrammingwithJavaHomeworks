package ch04_finalAndSealing.newStringType;

/*
1. Çalıştığınız bir projedeki ihtiyaçlara binaen, Java’daki java.lang.String sınıfından daha zengin hatta
bazı davranışlarda farklı davranan bir başka String tipini geliştirmeyi düşünseniz, bunu nasıl yapardınız?
 */

//String sınıfı final olduğu için extend edilemez. is-a ilişkisi yerine has-a ilişkisi kullanarak , String sınıfına erişebilir ,
//istdiğimiz eklemeleri yapabiliriz. Ancak bu kullanımın eksisi , kalıtım yapılamadığı için String sınıfının kendi davranışları yeni tipe manuel olarak eklenmelidir!

public class RichString {

    private final String str;

    public RichString(String str) {
        this.str = str;
    }

    //original feature - added manuelly.
    public int length() {
        return str.length();
    }

    //new feature
    public boolean isPalindrome() {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }



}
