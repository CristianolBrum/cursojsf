package br.com.devdojo.maratonajsf.util;

import javax.faces.context.FacesContext;

public class ApplicationMapUtil {
    public static Object getValueFromApplicationMap(String key) {
        return FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get(key);
    }

    public static void setValueInApplicationMao(String key, Object value){
        FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().put(key, value);
    }
}