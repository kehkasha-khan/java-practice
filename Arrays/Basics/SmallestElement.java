find the smallest element of array
  public class SmallestElement{
  public static void main(String [] args){
    int[] numbers = {5, 2, 9, 1, 7};
    int min = numbers[0];
    for(int i=0; i<numbers.length; i++){
      if(numbers[i] < min){
        min = numbers[i];
      }}
      System.out.println(min);
    }
}
