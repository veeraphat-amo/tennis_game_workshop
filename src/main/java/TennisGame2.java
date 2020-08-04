public class TennisGame2 {
    private int player1Point;
    private int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String player1Result = "";
        String player2Result = "";
        String[] scoreCalled = {"Love","Fifteen","Thirty","Forty"};

        String score = "";

        boolean equalAndIsNotDeuce = player1Point == player2Point && player1Point < 3;
        boolean equalAndIsDeuce = player1Point == player2Point && player1Point >= 3;
        boolean player1Wins = player1Point >= 4 && player2Point >= 0 && (player1Point - player2Point) >= 2;
        boolean player2Wins = player2Point >= 4 && player1Point >= 0 && (player2Point - player1Point) >= 2;

        if (equalAndIsNotDeuce) {
            return scoreCalled[player1Point] + "-All";
        }
        if (equalAndIsDeuce) {
            return "Deuce";
        }
        if (player1Point > player2Point && player2Point >= 3 && (player1Point - player2Point) == 1) {
            return "Advantage " + player1Name;
        }
        if (player2Point > player1Point && player1Point >= 3 && (player2Point - player1Point) == 1) {
            return "Advantage " + player2Name;
        }
        if (player1Wins) {
            return "Win for " + player1Name;
        }
        if (player2Wins) {
            return "Win for " + player2Name;
        }
        if (player1Point != player2Point && player1Point<4 && player2Point<4){
            return scoreCalled[player1Point] + "-" + scoreCalled[player2Point];
        }

     return null;
    }

    public void P1Score() {
        player1Point++;
    }

    public void P2Score() {
        player2Point++;
    }

    public void wonPoint(String player) {  //warning:
        // if (player.equals("player1")) => NullPointerException (NPE)
        if ("player1".equals(player)) // => NullSafety
            P1Score();
        else
            P2Score();
    }
}