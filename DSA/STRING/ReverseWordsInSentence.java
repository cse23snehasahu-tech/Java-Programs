package DSA.STRING;

public class ReverseWordsInSentence {
    public static void main(String[] args) {

        String str = "I am Ishu";

        String words[] = str.split(" ");

        for(int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
    }
}
