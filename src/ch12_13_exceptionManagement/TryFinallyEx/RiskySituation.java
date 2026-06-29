package ch12_13_exceptionManagement.TryFinallyEx;
/*
7. Aşağıdaki şartları yerine getiren bir metot yazın:
• try blokunda mesajı “A” olan bir Exception fırlatır
• finally blokunda mesajı “B” olan bir Exception fırlatır
• Sonra main metot yazıp programı çalıştırın, mesajı “A” olan
Exception’a ne olduğunu gözlemleyin ve bu senaryoda Java’nın ne
yaptığını ve bunun neden tehlikeli kabul edildiğini kısaca açıklayın.
 */
public class RiskySituation {

    public static void riskyMethod() throws Exception {
        try {
            throw new Exception("A");
        } finally {
            throw new Exception("B"); // buradaki exception, try'dan gelen "A"yı YUTAR
        }
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Yakalanan mesaj: " + e.getMessage()); //B
        }
    }
}
