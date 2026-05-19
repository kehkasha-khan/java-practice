counting even numbers in array

  public  class CountEven{
  public static void main (String [] args){
    int[] numbers = {2, 5, 8, 11, 14};
    int count = 0;
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i]%2==0){
       count ++;  
      }
      }
    System.out.println(count);
  }
}


output:
3
