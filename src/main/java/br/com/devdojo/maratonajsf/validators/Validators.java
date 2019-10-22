package br.com.devdojo.maratonajsf.validators;

import br.com.devdojo.maratonajsf.bean.login.LoginBean;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class Validators implements Serializable {
    @Inject
    private LoginBean loginBean;
    private List<String> emailsDB = asList("cristianolbrum@gmail.com", "powerguidissimo@gmail.com");

    public void validateDuplicatedEmail(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        //System.out.println(loginBean.getNome());
        String email = (String) o;
        if (emailsDB.contains(email)) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "O email ja existe cadastrado"
                    , "");
            throw new ValidatorException(message);
        }
    }
}
