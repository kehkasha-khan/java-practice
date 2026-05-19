Two Pointer Approach is a technique where two indexes are used to solve problems efficiently instead of using nested loops.
  🎯Why do we use it?
    Because it:
    ✅ reduces time complexity
    ✅ makes code faster
    ✅ avoids nested loops
  
  🎯 Use Two Pointer When…
      You need to:
      ✅ compare elements
      ✅ traverse from both sides
      ✅ reduce nested loops
      ✅ process pairs efficiently

  program to reverse an array using two pointer approch

  public class ReverseArray{
public static void main (String [] args) {
  int[] arr = {1, 2, 3, 4, 5};
  int i = 0;  // start
  int j = arr.length - 1; // end
  while(i < j){ // do swapping on this condition
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--; 
  }
  for(int k =0; k<arr.length; k++){
    System.out.println(arr[k]+" "); 
  }
 } }


output:
5
4
3
2
1
