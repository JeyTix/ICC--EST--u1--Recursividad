public class Recursividad {
    public int factorial(int n){
        System.out.println("Calculando el factorial de: "+ n);
        // Caso base= 0
        if (n== 0 || n==1) {
            System.out.println("Caso base alcanzando el factorial de "+n+ ": 1 ");
            return 1;
        } 
        int resultado = n* factorial(n-1);
        System.out.println("Resultado parcial para "+n+ " * factorial( "+(n+1)+ ")= "+resultado );
         return resultado;
        //return n* factorial(n-1);
    }
}
