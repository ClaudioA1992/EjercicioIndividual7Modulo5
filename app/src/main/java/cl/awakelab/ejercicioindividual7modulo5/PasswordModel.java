package cl.awakelab.ejercicioindividual7modulo5;

public class PasswordModel {

//    private String password;
//
//    public String getPassword() {
//        return password;
//    }

//    public PasswordModel(String password) {
//        this.password = password;
//    }

    public String passwordValidation(String password) {

        String code = "";
        int capitals = 0;

        for(int i = 0; i < password.length(); i++) {
            if (password.substring(i, i+1).matches("[A-Z]")) {
                capitals++;
            }
        }

        if (password.length() < 5) {
            code = "red";
        } else if(password.length() >= 5 && capitals > 0) {
            code = "yellow";
        } else if(password.length() >= 5 && capitals == 0) {
            code = "green";
        }

        return code;
    }

}
