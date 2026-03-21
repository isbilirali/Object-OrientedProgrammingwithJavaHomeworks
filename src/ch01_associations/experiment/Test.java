package ch01_associations.experiment;

import ch01_associations.experiment.aPackage.PublicClient;

//component nesnenin sınıfı default ve bileşik nesnenin sınıfı public olduğunda , paketin dışında bileşik nesne üzerinden component'lara ulaşılabilir mi? ---> YES

public class Test {
    static void main() {
        PublicClient client = new PublicClient();
        System.out.println(client.getData());
        client.assignTask();
    }
}
