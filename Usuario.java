public abstract class Usuario{
  protected String username;
  protected String nombre;
  protected RolUsuario rol;

  public Usuario(String username, String nombre, RolUsuario rol){
      this.username = username;
      this.nombre = nombre;
      this.rol = rol;
  }

  public String getUsername{
      return username;
  }

  public void SetUsername(String username){
      this.username = username;
  }

  public String getNombre{
      return nombre;
  }

  public void SetNombre(String nombre){
      this.nombre = nombre;
  }

  public RolUsuario getRol{
      return rol;
  }

  public void SetRol(RolUsuario rol){
      this.rol = rol;
  }

  @Override
  public String toString(){
      return "Usuario{" +
        "username='" + username + '\'' +
                ", nombre='" + nombre + '\'' +
                ", rol=" + rol +
                '}';
  }
}




