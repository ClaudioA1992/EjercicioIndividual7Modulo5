package cl.awakelab.ejercicioindividual7modulo5;

public class Presenter {

    private PasswordModel model;

    public void passwordEvaluation(String password) {

        String category = model.passwordValidation(password);

        if(category == "red") {

        } else if(category == "yellow") {

        } else if(category == "red") {

        } else {
            
        }

    }

}
