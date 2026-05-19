
checking if array is palindrome or not using two pointer approch
public class IsPalindrome{
  public static void main (String [] args){
    int[] array = {1, 2, 3, 2, 1};
    int i = 0;
    int j = array.length - 1;
    boolean isPalindrome = true;
    while(i<j){
      if(array[i] != array[j])
        isPalindrome = false;

      i++;
      j--;
    }
    System.out.println(isPalindrome);
  }
}

output:
true
