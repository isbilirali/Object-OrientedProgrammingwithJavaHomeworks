package ch08_abstractClasses;

import ch08_abstractClasses.Shapes.Factory.ShapeFactory;
import ch08_abstractClasses.Shapes.Shape;

/*
1. Shape sınıfının en tepede olduğu hiyerarşiyi düşünün.
    a. Shape sınıfının soyut olmasını bekler misiniz?
    b. Shape’in üzerindeki draw(), erase(), calculateArea() ve
    calculateCircumference() metotlarının soyut olmalarını nasıl karşılarsınız?
    c. Shape üzerindeki bazı metotları soyut yaparak hiyerarşiyi tekrar düzenleyin.
    d. Circle, Rectangle, Square ve Triangle ise Shape’in alt sınıflarıdır ve soyut
    metotları override ederler.
        • Ayrıca metotları override ederken mümkünse super’i kullanın.
    e. ShapeFactory isimli bir başka sınıfın üzerindeki createShape()
    isimli metodun da random olarak Shape sınıfının alt sınıflarının bir
    nesnesini yaratıp döndürmesini sağlayın.
    f. Test sınıfında da random Shape nesneleri üretirken artık Shape
    sınıfının nesnesini üretemeyeceğinizi de gözlemleyin.
 */
public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            Shape shape = ShapeFactory.createShape();

            shape.draw();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Circumference: " + shape.calculateCircumference());
            System.out.println("-------------------");
        }

//         Shape s = new Shape();  //'Shape' is abstract; cannot be instantiated
    }
}
