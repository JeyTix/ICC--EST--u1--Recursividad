public class Recursividad {
    public int factorial(int n) {
        System.out.println("Calculando el factorial de: " + n);
        // Caso base= 0
        if (n == 0 || n == 1) {
            System.out.println("Caso base alcanzando el factorial de " + n + ": 1 ");
            return 1;
        }
        int resultado = n * factorial(n - 1);
        System.out.println("Resultado parcial para " + n + " * factorial( " + (n + 1) + ")= " + resultado);
        return resultado;
        // return n* factorial(n-1);
    }

    // Calcular la suma de los numeros consecutivos
    // n=5, resultado= 5+4+3+2+1= 15
    public int sumaConsecutivo(int n) {
        System.out.println("Calculado la suma consecutivo de: " + n);
        if (n == 1) {
            System.out.println("Caso base alcanzando la suma");
            return 1;
        }

        return n + sumaConsecutivo(n - 1);
    }

    public int potencia(int base, int exp) {
        System.out.println("Calculando la potencia de: " + base + " elevado a " + exp);
        if (exp == 0) {
            System.out.println("Caso base alcanzando la potencia");
            return 1;
        }

        int resultado = base + potencia(base, exp - 1);
        System.out.println("El resultado parcial de la potencia es: " + resultado);
        return resultado;
    }

    public int sumaDigitos(int n) {
        System.out.println("Calculando la suma de los digitos de: " + n);
        if (n == 0) {
            System.out.println("Caso base alcanzando la suma de digitos");
            return 0;
        }
        int resultado = (n % 10) + sumaDigitos(n / 10);
        System.out.println("La suma parcial de los digitos es: " + resultado);
        return resultado;
    }

    public int contarDifigitos(int n) {
        System.out.println("Calculando el numero de digitos de: " + n);
        if (n == 0) {
            System.out.println("Caso base alcanzando el numero de digitos");
            return 0;
        }
        int resultado = 1 + contarDifigitos(n / 10);
        System.out.println("Resultado parcial de el conteo: " + resultado);

        return resultado;
    }

    public int finobacci(int n) {
        System.out.println("Calculando el fibonacci de: "+n);
        if (n == 0) {
            System.out.println("Finobacci de "+(n++)+" se descompone en fibonacci "+(n-1)+" y fibonacci "+(n-2));
            return 0;
        } else if (n == 1) {
            System.out.println("Finobacci de "+(n++)+" se descompone en fibonacci "+(n-1)+" y fibonacci "+(n-2));
            return 1;
        }

        int resultado = finobacci(n - 1) + finobacci(n - 2);
        System.out.println("Resultado parcial: " + resultado);
        return resultado;
    }
}
