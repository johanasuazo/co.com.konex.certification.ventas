package co.com.konex.certification.ventas.model;

public class TablaUsuarios {

    private String usuario;
    private String contrasenna;

    private String papeleria;

    public TablaUsuarios(String usuario, String contrasenna, String papeleria) {
        this.usuario = usuario;
        this.contrasenna = contrasenna;
        this.papeleria = papeleria;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getPapeleria() {
        return papeleria;
    }

    public void setPapeleria(String papeleria) {
        this.papeleria = papeleria;
    }
}
