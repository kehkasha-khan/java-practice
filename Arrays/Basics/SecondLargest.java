/* program to find second largest number in an array 
  so basically we take 2 variables first and second and then we will assign smallest 
  integer value to them i.e Integer.MIN_VALUE = -2174....
  than we check for 2 condition 
  1 in if we check if nums[i] > first then we swap there values second = first & first = nums [i];
  2 in else if we check if there is a number in array that is not largest but it should be scecond largest we check condition
    nums[i] > second && nums[i] != first */ 
public class SecondLargest{
public  static void main (String [] args){
int[] nums = {1, 2, 3, 4, 55, 67};
int first = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;
for(int i = 0; i < nums . length; i++){
  if(nums[i] > first){
    second = first ;
    first = nums [i];
    }
  else if( nums[i] > second && nums[i] != first){
    second = nums[i];
    
    }
 }
  System.out.println("firstlargest" + first+"secondlargest"+second);
  
}
  
}


output:
firstlargest 67	secondlargest 55

   
