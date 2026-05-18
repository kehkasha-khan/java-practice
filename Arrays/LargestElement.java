finding largest element of array
  class LargestElement {
    public static void main(String[] args) {
       int[]  numbers = {1, 34, 56, 23, 76, 87};
       int max = numbers[0];
       System.out.println("Printing larget element of array");
       for(int i=0; i < numbers.length; i++){
        if(numbers[i] > max)      
        max = numbers[i];
       }
       System.out.print(max);
    }
}

output:
Printing larget element of array
87
