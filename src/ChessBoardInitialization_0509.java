import java.util.Scanner;

public class ChessBoardInitialization_0509 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // build up the logics
        // building up the project from the smallest parts to be a whole unit!
        // codes should be possibly use anywhere else!

        System.out.println("Chess board (a little hardcoding)\n");

        // size 8 x 8
        // white - 0
        // black - X

        String brdStr = "";
        brdStr += "  A B C D E F G H\n";
        for (int row = 1; row < 9; row++) {
            brdStr += row + "";
            for (int col = 0; col < 8; col++) {
                brdStr += " .";
            }
            brdStr += "\n"; // line break
        }
        System.out.println(brdStr);


        System.out.println("\nChessboard with Pseudo code (or more hardcoding!) :)\n");
        System.out.println("Being result oriented :)");
        System.out.println("Find out how I built up the chessboard itself!\n");
        String chessBoardPseudo = "";

        chessBoardPseudo = "  A B C D E F G H\n";
        chessBoardPseudo += "1 W B W B W B W B\n";
        chessBoardPseudo += "2 B W B W B W B W\n";
        chessBoardPseudo += "3 W B W B W B W B\n";
        chessBoardPseudo += "4 B W B W B W B W\n";
        chessBoardPseudo += "5 W B W B W B W B\n";
        chessBoardPseudo += "6 B W B W B W B W\n";
        chessBoardPseudo += "7 W B W B W B W B\n";
        chessBoardPseudo += "8 B W B W B W B W\n";

        System.out.println(chessBoardPseudo);


        // Chess pieces: King (K), Queen (Q), Rook (R) - also called castle!
        // Bishop (B), Knight (N/Kt = N), Pawn (P)
        // the above mentioned reason B and W for Black and White is not OK! --> black X and white Y


        // TODO visualChessBoardFORPlayer
        // TODO backgroundChessBoard for switch the chess pieces and empty fields (to step with the chess pieces!)

        // TODO --> BRAINSTORMING!!! how to make more dinamic board

        System.out.println("To be continue ... out of order :) \n");

        // just an idea X and 0  --> using modulo operator (during uploading the empty board with black and white data's!
        // ie. if index % 2 == 0 --> X and if index % 2 != 0 --> 0


        // using StringBuilder (for using not that much memory!)

        System.out.println("Chessboard with StringBuilder: \n");

        StringBuilder stringBuilder = new StringBuilder(8);
        stringBuilder.append("  A B C D E F G H\n");
        stringBuilder.append("1 W B W B W B W B\n");
        stringBuilder.append("2 W B W B W B W B\n");
        stringBuilder.append("3 W B W B W B W B\n");
        stringBuilder.append("4 W B W B W B W B\n");
        stringBuilder.append("5 W B W B W B W B\n");
        stringBuilder.append("6 W B W B W B W B\n");
        stringBuilder.append("7 W B W B W B W B\n");
        stringBuilder.append("8 W B W B W B W B\n");
        System.out.println(stringBuilder);


        // just for practice & for fun:

        System.out.println("Chessboard with StringBuilder concatenate strings:");

        StringBuilder str = new StringBuilder(1);
        str.append("  A B C D E F G H\n");

        StringBuilder strBuildFor = new StringBuilder(7);
        strBuildFor.append("1 W B W B W B W B\n");

        System.out.println("" + str + strBuildFor);


    }
}
