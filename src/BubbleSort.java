public class BubbleSort {
    
    public BubbleSort(){
        System.out.println("Se creó la clase en el constructor");
    }

    public void sortAscendente(int numeros[]){
        for (int i = 0; i < numeros.length; i++){
            for (int j = i+1; j < numeros.length; j++){
                //Comparacion
                if (numeros[i] > numeros[j]){
                    //Si cumple -> Intercambio
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }

    public void sortDescendente(int numeros[]){
        for (int i = 0; i < numeros.length; i++){
            for (int j = i+1; j < numeros.length; j++){
                //Comparacion
                if (numeros[i] < numeros[j]){
                    //Si cumple -> Intercambio
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }

    public void printArreglo(int[] numeros) {
        for (int i : numeros){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    //[asc] TRUE ordenara ascendentemente
    //[asc] FALSE ordenara descendentemente
    public void sort(int[] numeros, boolean asc){
        if (asc){
            sortAscendente(numeros);
        }else {
            sortDescendente(numeros);
        }
    }
}

