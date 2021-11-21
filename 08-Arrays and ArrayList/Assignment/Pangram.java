package Assignment;


public class Pangram {
    public static void main(String[] args)
    {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    public static boolean checkIfPangram(String sentence)
    {
        int seen = 0;
        for(char c : sentence.toCharArray()) {
            int ci = c - 'a';
            seen = seen | (1 << ci);
        }
        System.out.println(seen);
        return seen == ((1 << 26) - 1);
    }
}
