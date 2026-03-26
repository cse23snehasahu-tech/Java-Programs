package DSA.STRING;
public class SubstringCheck {
    public static void main(String[] args) {

        String mainStr = "Hello Ishu";
        String subStr = "Ishu";

        if(mainStr.indexOf(subStr) != -1){
            System.out.println("Substring Present");
        } else {
            System.out.println("Substring Not Present");
        }
    }
}