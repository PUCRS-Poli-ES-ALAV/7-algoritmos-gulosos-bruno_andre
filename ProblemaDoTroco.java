// Tipos de moedas: 100, 25, 10, 5 e 1

public class ProblemaDoTroco{

    public static void main(String[] args) {
        //System.out.println(moedasTroco(450));
        System.out.println(moedaTrocoGuloso(450));
       // System.out.println(moedaTrocoGulosoDiv(450));
    }
    public static String moedasTroco(double valorTroco){
        int moedas100 = (int) (valorTroco / 100);
        int moedas25 = (int) ((valorTroco % 100) / 25);
        int moedas10 = (int) (((valorTroco % 100) % 25) / 10);
        int moedas5 = (int) ((((valorTroco % 100) % 25) % 10) / 5);
        int moedas1 = (int) (((((valorTroco % 100) % 25) % 10) % 5) / 1);
        return "\nmoedaTroco()\n" + moedas100 + " nota(s) de R$ 100,00\n" + moedas25 + " nota(s) de R$ 25,00\n" + moedas10 + " nota(s) de R$ 10,00\n" + moedas5 + " nota(s) de R$ 5,00\n" + moedas1 + " nota(s) de R$ 1,00";
    }

    public static String moedaTrocoGuloso(double valorTroco){
        String s = "\nmoedaTrocoGuloso( )\n";
        int[] moedas = {100, 25, 10, 5, 1};
        int moedas100 = 0;
        int moedas25 = 0;
        int moedas10 = 0;
        int moedas5 = 0;
        int moedas1 = 0;

        for(int i = 0; i <= moedas.length; i++){
            int maior = moedas[i];
            while(valorTroco >= maior){
                valorTroco -= maior;
                if(maior == 100){
                    moedas100++;
                }else if(maior == 25){
                    moedas25++;
                }else if(maior == 10){
                    moedas10++;
                }else if(maior == 5){
                    moedas5++;
                }else if(maior == 1){
                    moedas1++;
                }
            }
        }
        
       
        s += moedas100 + " nota(s) de R$ 100,00\n" + moedas25 + " nota(s) de R$ 25,00\n" + moedas10 + " nota(s) de R$ 10,00\n" + moedas5 + " nota(s) de R$ 5,00\n" + moedas1 + " nota(s) de R$ 1,00";
        
        return s;
    }

    public static String moedaTrocoGulosoDiv(double valorTroco){
        String s = "\nmoedaTrocoGulosoDiv( )\n";
        int moedas100 = 0;
        int moedas25 = 0;
        int moedas10 = 0;
        int moedas5 = 0;
        int moedas1 = 0;

       
        if(valorTroco >= 100){
            moedas100 = (int) (valorTroco / 100);
            valorTroco = valorTroco % 100;
        }
        if(valorTroco >= 25){
            moedas25 = (int) (valorTroco / 25);
            valorTroco = valorTroco % 25;
        }
        if(valorTroco >= 10){
            moedas10 = (int) (valorTroco / 10);
            valorTroco = valorTroco % 10;
        }
        if(valorTroco >= 5){
            moedas5 = (int) (valorTroco / 5);
            valorTroco = valorTroco % 5;
        }
        if(valorTroco >= 1){
            moedas1 = (int) (valorTroco / 1);
        }
        
        s += moedas100 + " nota(s) de R$ 100,00\n" + moedas25 + " nota(s) de R$ 25,00\n" + moedas10 + " nota(s) de R$ 10,00\n" + moedas5 + " nota(s) de R$ 5,00\n" + moedas1 + " nota(s) de R$ 1,00";
        
        return s;
    }
}