public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHello, World!");

        Recursividad r= new Recursividad();
        int resultado= r.factorial(5);
        System.out.println(resultado);
        int x= r.sumaConsecutivo(5);
        System.out.println("La suma de los numeros consecutivos es: "+x+"\n");
        int z= r.potencia(5, 0);
        System.out.println("El resultado es :"+z);
        int y= r.sumaDigitos(456);
        System.out.println("La suma de los digitos es: "+y+"\n");
        int d= r.contarDifigitos(345);
        System.out.println("El resultado de el conteo de digitos es: "+d+"\n");
    }
}
