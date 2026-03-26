package DSA.STRING;
public class CountVowelsConsonants{
    public static void main(String[] args) {
        String str="Shree";
        int vowels=0, consonants=0;
        str=str.toLowerCase();

        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='a' && ch<='z'){
                if(ch>='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.err.println("vowels:"+vowels);

        System.out.println("Consonants:"+consonants);
    }
}
