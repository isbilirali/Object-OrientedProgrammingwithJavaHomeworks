package ch12_13_exceptionManagement.InsufficientFundsException;

import java.util.Scanner;

/*
2. Banka sistemindeki BankAccount sınıfını düşünün. Bu sınıfta hesaptan
para çekmek için void withdraw(double amount) metodu
olmalıdır. Bu metotta fırlatılmak üzere hem çekilmek istenen miktarı hem
de bakiye bilgisini içeren InsufficientFundsException isimli bir
sıra dışı durum nesnesi tanımlayın.
a. Bakiye yetersiz olduğunda bu sıra dışı durum nesnesi fırlatılsın
b. Çağıran kod bu sıra dışı durumu yakalasın ve şöyle bir log mesajı
yazdırsın: “Hesaptan 500.0 TL çekilemez. Kullanılabilir bakiye: 120.0 TL”
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(120.0);

        System.out.print("Hesabınızdan ne kadar çekim talep ediyorsunuz? : ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(
                    "Hesaptan " + e.getAmount() +
                            " TL çekilemez. Kullanılabilir bakiye: " +
                            e.getBalance() + " TL"
            );
        }
    }
}