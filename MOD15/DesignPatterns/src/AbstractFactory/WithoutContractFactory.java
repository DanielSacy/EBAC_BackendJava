package AbstractFactory;

public class WithoutContractFactory extends AbstractFactory{

    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)) {
            return new BrasiliaCar(50, "cheio", "amarela");
        } else {
            return new PatineteCar(1, "cheio", "rosa");
        }
    }    
}
