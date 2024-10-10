//INTERFACE IS A MECHANISM/WAY TO ACHIVE 100% ABSTRACTION. INTERFACE IS BLUE PRINT OF CLASS.
public class Interfaces{
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("VERTICAL, HORIZONTAL, DIAGONAL");
    }
}

class King implements ChessPlayer{
     public void moves(){
        System.out.println("VERTICAL, HORIZONTAL, DIAGONAL");
    }
}

class Rook implements ChessPlayer{
     public void moves(){
        System.out.println("VERTICAL, HORIZONTAL");
    }
}

class Pawn implements ChessPlayer{
     public void moves(){
        System.out.println("DIAGONAL");
    }
}