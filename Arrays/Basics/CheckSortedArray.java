program to check if an array is sorted or not 
  public class CheckSortedArray{
  public static void main (String [] args){
int[] nums = {1, 2, 3, 4, 5};
   boolean  isSorted = true;
    for( int i = 0; i < nums.length-1; i++){
      if(nums[i] > nums[i+1]){
        isSorted = false;
      break;}
    }
    System.out.print(isSorted);
  }
}

output :
true
