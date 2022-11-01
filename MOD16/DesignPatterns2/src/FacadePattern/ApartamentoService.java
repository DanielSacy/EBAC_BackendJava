package FacadePattern;

public class ApartamentoService implements IApartamentoService {

    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isRegistered = isApartamentoCadastrado(apartamento);
        Boolean isFieldsValid = isFieldsValid(apartamento);
        if(isRegistered && !isFieldsValid){
            return false;
        }
        registerApartmentDB(apartamento);

        return null;
    }
    
    private Boolean registerApartmentDB(Apartamento apartamento) {
        //logic to send the apartment data to DB;
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento){
        // check in the DB if the apartment is registered
        return false;
    }

    private Boolean isFieldsValid(Apartamento apartamento){
        return true;
    }
}
