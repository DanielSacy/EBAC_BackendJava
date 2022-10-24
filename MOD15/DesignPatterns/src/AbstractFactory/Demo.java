package AbstractFactory;

public class Demo {
    public static void main(String args[]) {
        Customer cliente = new Customer("A", false);
        AbstractFactory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static AbstractFactory getFactory(Customer cliente) {
        if(cliente.hasCompanyContract()) {
            return new ContractFactory();
        } else {
            return new WithoutContractFactory();
        }
    }
}
