package ch12_13_exceptionManagement.InvalidInputException;
/*
4. Bir String girdisinden bir tamsayı okuyan (“5” —> 5) bir metot yazın.
Bu metotta çağrılan Java API’ının fırlatacağı
NumberFormatException sıra dışı durumunu yakalayın ve bunu,
daha açıklayıcı bir mesajla (örneğin, “Sayısal bir değer bekleniyordu,
ancak ‘abc’ alındı”) birlikte özel bir InvalidInputException olarak
yeniden fırlatın. Orijinal sıra dışı durum nesnesine de nasıl
erişilebileceğini gösterin.
 */
public class Main {

    public static void main(String[] args) {
        String input = "abc";
        try {
            int number = StringParser.parser(input);
            System.out.println("Parsed number: " + number);
        } catch (InvalidInputException e) {
            System.err.println("Hata: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
