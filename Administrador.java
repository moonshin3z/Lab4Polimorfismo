public class Administrador extends Usuario{
  private String claveAdmin;

  public Administrador(String username, String nombre, String claveAdmin){
    super(username, nombre, RolUsuario.ADMIN);
    this.claveAdmin = claveAdmin;

  }

  public String getClaveAdmin(){
    return claveAdmin;
  }

  public void setClaveAdmin(String claveAdmin){
    this.claveAdmin = claveAdmin;
  }

  @Override
    public String toString() {
        return "Administrador{" +
                "username='" + username + '\'' +
                ", nombre='" + nombre + '\'' +
                ", rol=" + rol +
                ", claveAdmin='" + claveAdmin + '\'' +
                '}';
    }
}


