
    import java.util.Scanner;

    public class CheckVowelOrConsonant {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an alphabet ");
            char ch = sc.next().charAt(0);
            checkVowelOrConsonant(alphabet);
        }

        static void checkVowelOrConsonant(char alphabet){
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
            {
                System.out.println("Alphabet is a vowel");
            }
            else
            {
                System.out.println("Alphabet is a consonant");
            }

    }

