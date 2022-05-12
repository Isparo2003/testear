public class Person {
    private String dni ;
    private String correo ;

    public Person(String dni, String correo) {
        this.dni = dni;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + dni + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    public String getdni() {
        return dni;
    }

    public void setdni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
