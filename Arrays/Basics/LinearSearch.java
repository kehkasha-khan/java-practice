public class LinearSearch{
public static void main (String [] args){
int[] arr = {20, 30, 40, 50, 60};
  int x = 40;
  int result = -1;
  for(int i = 0; i < arr.length; i++){
   if(arr[i] == x){
     result = i;
   }
  }
  System.out.print(result);
  
}
  
}
