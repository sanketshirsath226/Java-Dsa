package Class;
public class SearchInString {
    public static void main(String[] args) {
        System.out.println((char) search2("Hello",'e'));
    }
    // search in String : return index if character found
    // otherwise if character is not found return -1
    public static int search(String str,char target){
        if(str.length() == 0) return -1;

        for(int i=0;i<str.length() ; i++)
            if(str.charAt(i) == target) return i;

        //this line will execute if none of the element matches the target element
        // hence target not found
        return -1;
    }

    // search in String : return character if character found
    // otherwise if character is not found return -1
    public static int search2(String str,char target){
        if(str.length() == 0) return -1;

        for(char ch:str.toCharArray())
              if (ch == target) return ch;

        //this line will execute if none of the element matches the target element
        // hence target not found
        return -1;
    }

    // search in String : return true if character found
    // otherwise if character is not found return false
    public static boolean search3(String str,char target){
        if(str.length() == 0) return false;

        for(int i=0;i<str.length() ; i++)
            if(str.charAt(i) == target) return true;

        //this line will execute if none of the element matches the target element
        // hence target not found
        return false;
    }
}
