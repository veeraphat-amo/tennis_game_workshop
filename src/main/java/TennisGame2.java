public class TennisGame2 {
    private int player1Point;
    private int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String scoreCalled(int score) {
        if (score == 0) {
            return "Love";
        }
        else if (score == 1) {
            return "Fifteen";
        }
        else if (score == 2) {
            return "Thirty";
        }
        else if (score == 3) {
            return "Forty";
        }
        return null;
    }

    public String getScore() {
//        String player1Result = "";
//        String player2Result = "";

        String score = "";
        if (player1Point == player2Point && player1Point < 4) {
            score = scoreCalled(player1Point);
            score += "-All";
        }
        else if (player1Point == player2Point && player1Point >= 3) {
            score = "Deuce";
        }

        else if (player1Point > player2Point && player2Point >= 3) {
            score = "Advantage player1";
        }

        else if (player2Point > player1Point && player1Point >= 3) {
            score = "Advantage player2";
        }

        else if (player1Point >= 4 && player2Point >= 0 && (player1Point - player2Point) >= 2) {
            score = "Win for player1";
        }
        else if (player2Point >= 4 && player1Point >= 0 && (player2Point - player1Point) >= 2) {
            score = "Win for player2";
        }

        else {
            score = scoreCalled(player1Point) + "-" + scoreCalled(player2Point);
        }
        return score;
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
