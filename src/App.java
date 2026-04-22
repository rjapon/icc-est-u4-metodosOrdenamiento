public class App {
    public static void main(String[] args) throws Exception {

        //int[] numeros = {10, 0, -5, 5, 15, 2};
        //runBubbleSort();
        runBubbleSortAvz();

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

        burbuja.sort(numeros, true);;
        burbuja.printArreglo(numeros);
        burbuja.sort(numeros, false);
        burbuja.printArreglo(numeros);

    }

    public static void runBubbleSortAvz() {
        int[] array = new int[]{9,2,3,0,8,5,10,50,100};

        //Instanciar la clase
        BubbleSortAvz bsAvz = new BubbleSortAvz(array);
        bsAvz.printArray();
        bsAvz.sort(true);
        bsAvz.printArray();
    }
}
