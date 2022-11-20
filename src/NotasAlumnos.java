import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota = 0.0;
        double mayores5 = 0.0;
        double menores4 = 0.0;
        double unos = 0.0;
        double total = 0.0;
        int j = 0;
        int k = 0;


        for (int i = 1; i <= 20; i++) {
            System.out.println("Ingrese la nota [de 1 a 7] de la materia " + i + ":");
            nota = s.nextDouble();
            if (nota == 0 || nota > 7) {
                System.out.println("Debe ingresar notas entre 1 y 7");
                System.exit(1); // con status = 1 indico que hay un error y salgo del programa
            } else if (nota > 5) {
                mayores5 += nota;
                total += nota;
                j++;

            } else if (nota < 4) {
                if (nota == 1){
                    unos++;
                }
                menores4 += nota;
                total += nota;
                k++;

            } else {
                total += nota;
            }
        }
        System.out.println("El alumno tiene:" +
                            "\n" + unos + " uno(s)" +
                            "\n" + mayores5/j + " como promedio en notas mayores a 5" +
                            "\n" + menores4/k + " como promedio en notas menores a 4" +
                            "\n" + total/20 + " como promedio total");
        }
}
