import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class TP12_ExpresionesRegulares {
    public static void main(String[] args) {
        String texto = "la expresión regular manzana coincidirá con la cadena 'manzana' 89 ";

        // Expresión regular
        String patron = "(\\d)";

        // Crear un objeto Pattern y Matcher
        Pattern pattern = Pattern.compile(patron); //representa un patrón de expresión regular.
        Matcher matcher = pattern.matcher(texto); //para buscar coincidencias

        if (matcher.find()) {
            System.out.println("Coincidencia encontrada: " + matcher.group());
        }

        String entrada = "Carlos Lopez\n449 123 45 67\ncarlos_@hotmail.com\nwww.carlos.com";
        String telefono ="(\\b\\d{3} \\d{3} \\d{2} \\d{2}\\b)";
        Pattern pattern2 = Pattern.compile(telefono);
        Matcher matcher2 = pattern2.matcher(entrada);

        if (matcher2.find()) {
            System.out.println("Número ingresado, correcto : " + matcher2.group());
        }else{
            System.out.println("Número no valido");
        }
        String correo ="(\\b[\\w.%-]+@[\\w.-]+\\.[a-zA-Z]{2,4}\\b)";
        Pattern pattern3 = Pattern.compile(correo);
        Matcher matcher3 = pattern3.matcher(entrada);

        if (matcher3.find()) {
            System.out.println("Correo ingresado correcto : " + matcher3.group());
        }else{
            System.out.println("Correo no valido");
        }


        String cadena = "prueba123";
        patron = ".*[^0-9]$";
        //.*: patrón que coincide con cualquier número de caracteres
        //[^0-9]: coincide con cualquier carácter que no sea un dígito numérico
        //$: coincide con el final de una cadena
        Pattern pattern4 = Pattern.compile(patron);
        Matcher matcher4 = pattern4.matcher(cadena);
        // Comprueba si la cadena no acaba con un dígito
        if (matcher4.matches()) {
            System.out.println("La cadena no acaba con un dígito");
        } else {
            System.out.println("La cadena acaba con un dígito");
        }


        cadena = "1rueba123";
        patron = "^[^0-9].*";
        //^: principio de una cadena
        //[^0-9]: cualquier carácter que no sea un dígito numérico
        //.*: patrón que coincide con cualquier número de caracteres
        Pattern pattern5 = Pattern.compile(patron);
        Matcher matcher5 = pattern5.matcher(cadena);

        // Comprueba si la cadena no acaba con un dígito
        if (matcher5.matches()) {
            System.out.println("La cadena no empieza con un dígito");
        } else {
            System.out.println("La cadena empieza con un dígito");
        }


        cadena = "MdfGecTH";
        patron = "^[a-zA-Z]{5,10}$";
        //^ y $: principio y final de una cadena
        //{5,10}: rango de números
        Pattern pattern6 = Pattern.compile(patron);
        Matcher matcher6 = pattern6.matcher(cadena);

        if (matcher6.matches()) {
            System.out.println("La cadena cumple con los requisitos.");
        } else {
            System.out.println("La cadena no cumple con los requisitos.");
        }


        String dni = "42-854-642";
        patron = "^\\d{2}-\\d{3}-\\d{3}$";
        Pattern pattern7 = Pattern.compile(patron);
        Matcher matcher7 = pattern7.matcher(dni);

        if (matcher7.matches()) {
            System.out.println("El DNI cumple con el formato");
        } else {
            System.out.println("no cumple el formato");
        }


        ArrayList<String> listaEmails = new ArrayList<>();
        String[] correos = {
                "usuario1@example.com",
                "invalid.email",
                "usuario2@example.com",
                "usuario3@example.com",
        };
        String patronCorreo = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern patternCorreo = Pattern.compile(patronCorreo);
        for (String email : correos) {
            Matcher matcherCorreo = patternCorreo.matcher(email);
            if (matcherCorreo.matches()) {
                listaEmails.add(email);
            }
        }

        System.out.println("Correos válidos:");
        for (String email : listaEmails) {
            System.out.println(email);
        }


        cadena = "abcdefghijnskcnmz";
        patron = "abc";

        Pattern pattern8 = Pattern.compile(patron);
        Matcher matcher8 = pattern8.matcher(cadena);

        if (matcher8.find()) {
            System.out.println("La cadena contiene 'abc'.");
        } else {
            System.out.println("La cadena no contiene 'abc'.");
        }
    }
}