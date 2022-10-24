package AbstractFactory;

public class ContractFactory extends AbstractFactory{

    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)) {
            return new CorolaCar(100, "cheio", "azul");
        } else {
            return new GolCar(70, "cheio", "preto");
        }
    }
    
}
