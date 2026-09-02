import java.util.Scanner;

public class Velha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];
        int jogada = 0, linha = 0, coluna = 0;
        boolean vencedor = false;

        preencherTabuleiro(tabuleiro);

        while (!vencedor){
            if (jogada % 2 == 0){
                System.out.println("Vez do jogador 1: ");
                System.out.print("Escolha a linha: ");
                linha = scan.nextInt() - 1;
                System.out.print("Escolha a coluna: ");
                coluna = scan.nextInt() - 1;

                while (tabuleiro[linha][coluna] != ' '){
                    System.out.println("Jogada inválida! Tente novamente:");
                    System.out.println("Vez do jogador 1: ");
                    System.out.print("Escolha a linha: ");
                    linha = scan.nextInt() - 1;
                    System.out.print("Escolha a coluna: ");
                    coluna = scan.nextInt() - 1;
                }

                jogada++;

                tabuleiro[linha][coluna] = 'X';

                printaTabuleiro(tabuleiro);
            }
            else {
                System.out.println("Vez do jogador 2: ");
                System.out.print("Escolha a linha: ");
                linha = scan.nextInt() - 1;
                System.out.print("Escolha a coluna: ");
                coluna = scan.nextInt() - 1;

                while (tabuleiro[linha][coluna] != ' '){
                    System.out.println("Jogada inválida! Tente novamente:");
                    System.out.println("Vez do jogador 2: ");
                    System.out.print("Escolha a linha: ");
                    linha = scan.nextInt() - 1;
                    System.out.print("Escolha a coluna: ");
                    coluna = scan.nextInt() - 1;
                }

                jogada++;

                tabuleiro[linha][coluna] = 'O';

                printaTabuleiro(tabuleiro);
            }
            if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') || (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') || (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || (tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X') || (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X')){
                System.out.println("JOGADOR 1 VENCEU!! PARABENS!!");
                vencedor = true;
            }
            else if((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') || (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') || (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || (tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O') || (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O')){
                System.out.println("JOGADOR 2 VENCEU!! PARABENS!!");
                vencedor = true;
            }
            else if ((tabuleiro[0][0] == 'O' || tabuleiro[0][0] == 'X') && (tabuleiro[0][1] == 'O' || tabuleiro[0][1] == 'X') && (tabuleiro[0][2] == 'O' || tabuleiro[0][2] == 'X') && (tabuleiro[1][0] == 'O' || tabuleiro[1][0] == 'X') && (tabuleiro[1][1] == 'O' || tabuleiro[1][1] == 'X') && (tabuleiro[1][2] == 'O' || tabuleiro[1][2] == 'X') && (tabuleiro[2][0] == 'O' || tabuleiro[2][0] == 'X') && (tabuleiro[2][1] == 'O' || tabuleiro[2][1] == 'X') && (tabuleiro[2][2] == 'O' || tabuleiro[2][2] == 'X')){
                System.out.println("DEU VELHA!");
                vencedor = true;
            }
        }
    }

    public static void preencherTabuleiro(char[][] tabuleiro){
        for (int i = 0; i < 3; i++){ //printa o tabuleiro
            for (int j = 0; j < 3; j++){
                tabuleiro[i][j] = ' ';
                System.out.print(tabuleiro[i][j]+" | ");
            }
            System.out.println(" ");
            System.out.println("-----------");
        }
    }

    public static void printaTabuleiro(char[][] tabuleiro){
        for (int i = 0; i < 3; i++){ //printa o tabuleiro
            for (int j = 0; j < 3; j++){
                System.out.print(tabuleiro[i][j]+" | ");
            }
            System.out.println(" ");
            System.out.println("-----------");
        }
    }
}