package ch07_instanceof.payrollOffice;

import ch07_instanceof.payrollOffice.Domain.*;

/*
1. Bir önceki bölümdeki factory.office.TestPayrollOffice örneğine gidin:
a. PayrollOfice’in paySalary(Employee e) metodunu değiştirin:
Maaşını almaya gelen Director ise PayrollOfice “Hoş geldiniz!”, Manager ise “Müdürüm!” desin.
b. PayrollOffice uygulamasında pattern matching kullanın.PayrollOfice’in paySalary(Employee e) metodununda
Director ve Manager nesnelerini bulmak için pattern matchingten faydalanın.
c. Önceki PayrollOffice uygulamasında switch cümlesi ya da ifadesini pattern matching ile kullanın.
d. case’den sonra gelen pattern labellarında when ile nesneler arasında değişik seçimler yapın.
 */

public class PayrollOffice {
    public void paySalary(Employee employee) { // employee = m1;
        double salary = employee.calculateSalary();

        /*
        if(employee instanceof Director d ){
            System.out.println("Müdürüm!");
        }else if(employee instanceof Manager m){
            System.out.println("Hoşgeldiniz...");
        }
        */

        switch (employee){
            case Director d when d.getName().equals("Mehmet") -> System.out.println("Mehmet Müdürüm!");
            case Director d when d.calculateSalary() > 100000 -> System.out.println("Yemekler Müdürümden!");
            case Manager m when m.getName().equals("Fatma") -> System.out.println("Fatma Müdürüm!");
            case Manager m when m.calculateSalary() > 50000 -> System.out.println("Kahveler Müdürümden!");
//             default -> System.out.println("Hoşgeldiniz...");
            case Employee e -> System.out.println("Hoşgeldiniz...");
        }
        System.out.println("Paying a salary of " + salary + " to " + employee.getName());
    }
}

