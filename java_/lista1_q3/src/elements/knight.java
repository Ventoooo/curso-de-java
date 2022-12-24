package elements;

public class knight {

    public double is_knight_on_board(int x, int y, int k) {
        String[][] tabuleiro = new String[8][8];
        double chances = 0;
        for (int l = 0; l < 8; l++){
            for (int c = 0; c < 8; c++){
                tabuleiro[l][c] = "_";
            }
        }

        for (int c = 0; c < k; c++){

            int knightL = x;
            int knightC = y;

            if (knightL + 2 < 8 && knightC -1 > 0){

            }


        }

    }
}
