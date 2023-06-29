public class Ejercicio1 {
    public static void main(String[] args) {
        int evaluacion1 = 8;
        int evaluacion2 = 6;
        int evaluacion3 = 7;
        
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3.0;
        
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
