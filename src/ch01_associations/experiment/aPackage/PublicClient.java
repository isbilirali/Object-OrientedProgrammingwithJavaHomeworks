package ch01_associations.experiment.aPackage;

public class PublicClient {

    private DefaultService service = new DefaultService();

    public int getData(){
        return service.data;
    }

    public void assignTask(){
        service.doIt();
    }
}
