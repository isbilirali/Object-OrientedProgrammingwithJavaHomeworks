package ch04_finalAndSealing.templateMethodPattern;

/*
DataProcessor adlı bir sınıf oluşturun ve bu sınıfta,
protected olan validate(), transform() ve save() metotlarını çağıran final bir process() metodu oluşturun.
Bu metodun gerçekleştirmesini yukarıdaki 3 metodu çağıracak şekilde yapın.
a. DataProcessor sınıfının örneğin XMLDataProcessor gibi farklı alt sınıflarını oluşturup metotları override edin.
 */

/*
Bu soru aslında klasik bir Design Pattern'i anlatıyor — Template Method Pattern
final olan process() metodu şablonu (template) belirler ,
adımların sırası değişmez. Alt sınıflar sadece adımların içeriğini override eder.
 */

public class DataProcessor {

    // FINAL — şablon değişmez, adımların sırası sabittir.
    public final void process() {
        System.out.println("=== Process Starting ===");
        validate();
        transform();
        save();
        System.out.println("=== Process Completed ===");
    }

    protected void validate() {
        System.out.println("Default validation...");
    }

    protected void transform() {
        System.out.println("Default transformation...");
    }

    protected void save() {
        System.out.println("Default saving...");
    }

}
