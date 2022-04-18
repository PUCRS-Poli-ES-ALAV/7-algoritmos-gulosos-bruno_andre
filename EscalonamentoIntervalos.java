import java.util.ArrayList;

public class EscalonamentoIntervalos {
    public static ArrayList<Integer> SDMGuloso(ArrayList<Integer> inicio, ArrayList<Integer> fim, int n){
        ArrayList<Integer> X = new ArrayList<Integer>();
        int i = 1;
        while(i <= n){
            X.add(i);
            int k = i + 1;
            while(k < n && inicio.get(k) < fim.get(i)){
                k++;
            }
            i = k;
        }
        return X;
    }


    public static void main(String[] args) {
        //intervalos inicio e fim
        int[] inicio = {6,9,7,18,1,23,25,30};
        int[] fim = {15,15,16,24,26,28,30,34};

        //coloca os vetores em ArrayList
        ArrayList<Integer> arrayInicio = new ArrayList<Integer>();
        ArrayList<Integer> arrayFim = new ArrayList<Integer>();
        for (int i = 0; i < inicio.length; i++) {
            arrayInicio.add(inicio[i]);
            arrayFim.add(fim[i]);
        }

        //odenar os intervalos em ordem crescente de fim
        for (int i = 0; i < arrayInicio.size(); i++) {
            for (int j = i + 1; j < arrayInicio.size(); j++) {
                if (arrayFim.get(i) > arrayFim.get(j)) {
                    int aux = arrayFim.get(i);
                    arrayFim.set(i, arrayFim.get(j));
                    arrayFim.set(j, aux);

                    aux = arrayInicio.get(i);
                    arrayInicio.set(i, arrayInicio.get(j));
                    arrayInicio.set(j, aux);
                }
            }
        }

        //encontrar uma subcoleção disjunta máxima de inicio e fim
        ArrayList<Integer> X = SDMGuloso(arrayInicio, arrayFim, arrayInicio.size());
        
        //imprimir a subcoleção disjunta máxima de inicio e fim
        System.out.println("\nSDMGuloso()\n");
        for (int i = 0; i < X.size()-1; i++) {
            System.out.println("Intervalo " + X.get(i) + ": " + arrayInicio.get(X.get(i)) + " - " + arrayFim.get(X.get(i)));
        }

    }    
}
