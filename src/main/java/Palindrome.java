public class Palindrome {
    public Boolean palindromecheck(String a){
        StringBuilder reverse = new StringBuilder();
        for(int i = a.length()-1;i>=0;i--){
            reverse.append(a.charAt(i));
        }                   //racecar
        return a.equals(reverse.toString());
    }
}


