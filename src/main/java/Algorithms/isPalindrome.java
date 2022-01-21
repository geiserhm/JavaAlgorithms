package Algorithms;

public class isPalindrome {


    public static void main(String[] args)
    {
        String palindromo = "Anita lava la tina";

       System.out.print("This string is palindrome? " +
                isPalindrome(palindromo));

        //System.out.print(otroPalindromo(palindromo));

    }
     private static boolean isPalindromo(String palindromo)
     {
         palindromo = palindromo.toLowerCase().replace(
                 " ", "");
         String palindromoInvertido = new
                 StringBuilder(palindromo).reverse().toString();
         return palindromoInvertido.equals(palindromo);
     }

     private static String otroPalindromo(String palindromo){

        palindromo = palindromo.toLowerCase().replace(" ", "");
        char[] s = palindromo.toCharArray();
        int n = s.length;
        int halfPalindromo = n/2;
        for(int i=0; i<halfPalindromo; i++){
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return new String(s);
     }

    static boolean isPalindrome(String text){
        text = text.toLowerCase().replace(" ", "");
        int i = 0, j = text.length() - 1;
        while(i < j){
            if(text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}