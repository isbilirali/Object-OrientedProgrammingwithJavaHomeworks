package ch06_polymorphism.shapes;

import ch06_polymorphism.shapes.domain.*;

/*
1. Shape sınıfının en tepede olduğu bir hiyerarşi düşünün.
a. Shape‘in üzerinde draw(), erase(), calculateArea() ve calculateCircumference() metotları vardır.
b. Circle, Rectangle, Square ve Triangle ise Shape’in alt sınıflarıdır ve bu metotları override ederler.
c. Metotları override ederken mümkünse “super”i kullanın.
d. Canvas diye bir başka sınıf oluşturun ve üzerine Shape alan, drawShape(Shape) ve eraseShape(Shape) metotlarını koyun.
e. ShapeFactory isimli bir başka sınıfın üzerindeki createShape() isimli metodun da random olarak bir Shape nesnesi yaratıp döndürmesini sağlayın.
f. Test sınıfında da random Shape nesneleri üretip, Canvas’ın metotlarına geçin ve hangi metotların çağrıldığını gözleyin.
 */

public class Test {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        ShapeFactory factory = new ShapeFactory();

        Shape s = factory.createShape();
        canvas.drawShape(s);
        canvas.eraseShape(s);

    }
}
