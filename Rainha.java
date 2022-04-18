public class Rainha {
    public static void main(String[] args) {
        // Definir o tamanho do board n x n
        // o número de rainhas será correspondente à n
        // testar uma configuração de posição para as rainhas no tabuleiro
        // se a as rainhas posicionadas não atacarem, a configuração é valida
        // se a configuração é valida, imprimir a configuração
        // enquanto há configurações não testadas, testar as configurações possíveis

        // a rainha ataca as posições da sua diagonal, horizontal e vertical
        // começar na posição to topo esquerdo (0,0) e vai até o fim do tabuleiro
        // se uma rainha já posicionada pode atacar uma posição, não é possível posicionar uma nova rainha nesta posição


        int n = 8;
        int[][] board = new int[n][n];
        int[] queens = new int[n];
        int queensPlacedOnBoard = 0;


    }
}
