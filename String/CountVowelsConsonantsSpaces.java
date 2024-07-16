package String;

public class CountVowelsConsonantsSpaces {
    public static void main(String[] args) {
        // String str = "Welcome to Chhattisgarh Bhancha, what do you do";
        String str = "Take u forward is Awesome";
        str = str.toLowerCase();

        int spaces = 0, vowels = 0, consonants = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                vowels++;
            
            else if (ch >= 'a' &&  ch <= 'z')
                consonants++;

            else if( ch == ' ')
                spaces++;
        }
        System.out.println("Vowels: "+ vowels + " Spaces: "+ spaces + " Consonants: "+ consonants );
    }
}
