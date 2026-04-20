public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};
        runBubbleSort();
    }

    public static void runBubbleSort(){
        System.out.println("Metodo Burbuja");
        int[] numeros = {-5, 10, 2, 0, 7};

        //Instancia de la clase

        BubbleSort burbuja = new BubbleSort();

        // burbuja.printArreglo(numeros);
        // burbuja.sortAscendente(numeros);
        // burbuja.printArreglo(numeros);

        // burbuja.sortDescendente(numeros);
        // burbuja.printArreglo(numeros);

        burbuja.printArreglo(numeros);
        burbuja.sort(numeros, true);;
        burbuja.printArreglo(numeros);
        burbuja.sort(numeros, false);
        

    }
}
