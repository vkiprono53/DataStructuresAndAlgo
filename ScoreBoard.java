public class ScoreBoard {
    private int numEntries = 0;
    private GameEntry[] gameEntry;

    public ScoreBoard(int capacity){
        gameEntry = new GameEntry[capacity];
    }

    public void add(GameEntry gameEnt){
        int newScore = gameEnt.getScores();

        if (numEntries < gameEntry.length || newScore > gameEntry[numEntries-1].getScores()){
            if (numEntries < gameEntry.length){
                numEntries++;
            }
            int j = numEntries-1; // Hold the last value index

            // Decrease the index of each element to create space for the new element
            while (j> 0 && gameEntry[j-1].getScores() < newScore){
                gameEntry[j] = gameEntry[j-1];
                j--;
            }
            gameEntry[j] = gameEnt;

        }
    }
}
