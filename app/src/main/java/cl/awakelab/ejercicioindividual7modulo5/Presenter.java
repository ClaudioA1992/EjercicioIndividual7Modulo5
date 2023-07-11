package cl.awakelab.ejercicioindividual7modulo5;

import com.google.android.material.snackbar.Snackbar;

public class Presenter {

    private PasswordModel model;
    private IViewPresenter viewPresenter;

    public Presenter(IViewPresenter presenter) {
        this.viewPresenter = presenter;
        model = new PasswordModel();
    }

    public void passwordEvaluation(String password) {

        String category = model.passwordValidation(password);
        System.out.println(category);

        if(category == "red") {
            viewPresenter.showWeak();
        } else if(category == "yellow") {
            viewPresenter.showMedium();
        } else if(category == "green") {
            viewPresenter.showStrong();
        } else {
            viewPresenter.showError();
        }

    }

}
