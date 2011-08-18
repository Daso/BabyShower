package babyshowerjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Asistente {
    private String _nombre;
    private String _fechaNacimiento;

    public Asistente(String _nombre, String _fechaNacimiento) {
        this._nombre = _nombre;
        this._fechaNacimiento = _fechaNacimiento;
    }
    
    public int calcularEdad() {

String datetext = this._fechaNacimiento;
try {
Calendar birth = new GregorianCalendar();
Calendar today = new GregorianCalendar();
int age=0;
int factor=0;
Date birthDate=new SimpleDateFormat("dd/MM/yyyy").parse(datetext);
Date currentDate=new Date(); //current date
birth.setTime(birthDate);
today.setTime(currentDate);
if (today.get(Calendar.MONTH) <= birth.get(Calendar.MONTH)) {
if (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH)) {
if (today.get(Calendar.DATE) > birth.get(Calendar.DATE)) {
factor = -1; //Aun no celebra su cumpleaÃ±os
}
} else {
factor = -1; //Aun no celebra su cumpleaÃ±os
}
}
age=(today.get(Calendar.YEAR)-birth.get(Calendar.YEAR))+factor;
return age;
} catch (ParseException e) {
return -1;
}

}
  
public int decirEdad(){
    return this.calcularEdad();
}   

public int preguntarEdad(Asistente asistente){
    return asistente.decirEdad();
}
}
