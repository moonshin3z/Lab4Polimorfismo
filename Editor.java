public class Editor extends Usuario{
  private String seccion;


  public Editor (String username, String nombre, String seccion){
    super(username, nombre, RolUsuario.EDITOR);
    this.seccion = seccion;
  }

  public String getSeccion(){
    return seccion;
  }

  public void setSeccion (String seccion){
    this.seccion = seccion;
  }

  @Override
    public String toString() {
        return "Editor{" +
                "username='" + username + '\'' +
                ", nombre='" + nombre + '\'' +
                ", rol=" + rol +
                ", seccion='" + seccion + '\'' +
                '}';
    }
}

