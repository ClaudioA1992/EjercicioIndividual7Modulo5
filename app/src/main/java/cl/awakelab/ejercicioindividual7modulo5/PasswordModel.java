package cl.awakelab.ejercicioindividual7modulo5;

public class PasswordModel {

    public String passwordValidation(String password) {

        String code = "";
        int capitals = 0;

        for(int i = 0; i < password.length(); i++) {
            if (Character.toString(password.charAt(i)).matches("[A-Z]")) {
                capitals++;
            }
        }

        if (password.length() < 5) {
            code = "red";
        } else if(password.length() >= 5 && capitals == 0) {
            code = "yellow";
        } else if(password.length() >= 5 && capitals > 0) {
            code = "green";
        } else {
            System.out.println("Nothing");
        }

        return code;
    }

}
