

package boletin18_1;
import Boletin18_2.Persoal;
/**
 *
 * @author clamascabaleiro
 */
public class Boletin18_1 {

 
    public static void main(String[] args) {
        Persoal pedrin = new Persoal("986345412", "pedrosanchez@partidosocialista.org");
        Persoal martina = new Persoal("986317731", "martasanchez@hotmail.com");
        Academica pedro = new Academica("Pedro", 13, pedrin);
        Academica marta = new Academica("Marta", 9, martina);
        pedro.setNota(8);
        System.out.println(pedro.toString());
        System.out.println(marta.toString());
    }

}
