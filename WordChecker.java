import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;

    public WordChecker(ArrayList<String> list)
    {
        wordList = list;
    }

    public WordChecker()
    {
        wordList = new ArrayList<String>();
    }


     public boolean isWordChain() 
     {
        boolean wordChain = true;
        for(int i = 1; i < wordList.size(); i++);
     }
//     public ArrayList<String> createList(String target) {
//         /* to be implemented in part (b) */ }
// 
}