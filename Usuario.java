public abstract class Usuario{
  protected String username;
  protected String nombre;
  protected RolUsuario rol;

  Public Usuario(String username, String nombre, RolUsuario rol){
      this.username = username;
      this.nombre = nombre;
      this.rol = rol;
  }

  Public String getUsername{
      return username;
  }

  Public void SetUsername(String username){
      this.username = username;
  }

  Public String getNombre{
      return nombre;
  }

  Public void SetNombre(String nombre){
      this.nombre = nombre;
  }

  Public RolUsuario getRol{
      return rol;
  }

  Public void SetRol(RolUsuario rol){
      this.rol = rol;
  }

  @Override
  Public String toString(){
      return "Usuario{" +
        "username='" + username + '\'' +
                ", nombre='" + nombre + '\'' +
                ", rol=" + rol +
                '}';
  }
}



