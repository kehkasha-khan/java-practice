printing sum of array

class SumOfArray {
    public static void main(String[] args) {
       int[]  numbers= {1, 34, 56, 23, 76, 87};
       int sum=0;
       System.out.println("Printing sum of array");
       for(int i=0; i<numbers.length; i++){
           sum += numbers[i];
       }
       System.out.print(sum);
    }
}


output:
Printing sum of array
277
