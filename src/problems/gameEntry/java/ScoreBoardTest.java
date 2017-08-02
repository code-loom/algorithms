public class ScoreBoardTest {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard(3);
        scoreBoard.add(new GameEntry("Hockey", 100));
        scoreBoard.add(new GameEntry("Hockey", 92));
        scoreBoard.add(new GameEntry("Hockey", 97));
        System.out.println(scoreBoard.toString());
        scoreBoard.add(new GameEntry("Hockey", 99));
        scoreBoard.add(new GameEntry("Hockey", 91));
        System.out.println(scoreBoard.toString());
    }
}