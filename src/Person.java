import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pat = Pattern.compile("[0-9]{7,8}[A-Za-z]");
        Matcher mat = pat.matcher("4258965P");
        this.dni = dni;

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if ( correo != null ) {
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher mather = pattern.matcher(correo);
            if (mather.find() == true) {
                this.correo = correo;
            } else {
                this.correo = "";
            }
        }else this.correo = "";
    }
}
