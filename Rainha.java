public class Rainha{

    //Verifica na horizontal se possui rainha em conflito
    public static boolean horizontal(int[][] tabuleiro, int linha, int coluna){
        for(int i = 0; i < tabuleiro.length; i++){
            if(tabuleiro[linha][i] == 1){
                return true;
            }
        }
        return false;
    }
    
    //Verifica na vertical se possui rainha em conflito
    public static boolean vertical(int[][] tabuleiro, int linha, int coluna){
        for(int i = 0; i < tabuleiro.length; i++){
            if(tabuleiro[i][coluna] == 1){
                return true;
            }
        }
        return false;
    }

    //Verifica na diagonal se possui rainha em conflito
    public static boolean diagonal(int[][] tabuleiro, int linha, int coluna){
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){
                if(i == linha && j == coluna){
                    continue;
                }
                if(i + j == linha + coluna || i - j == linha - coluna){
                    if(tabuleiro[i][j] == 1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Colocar n rainhas em uma n por n tabuleiro
        int n = 8;
        int[][] tabuleiro = new int[n][n];

        //Preenche o tabuleiro com as rainhas uma por vez
        //Se não houver conflito, coloca a rainha
        //Se houver conflito, remove a rainha
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!horizontal(tabuleiro, i, j) && !vertical(tabuleiro, i, j) && !diagonal(tabuleiro, i, j)){
                    tabuleiro[i][j] = 1;
                    break;
                }
                else{
                    tabuleiro[i][j] = 0;
                }
            }
        }

        //Imprime o tabuleiro
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }            
    }
}