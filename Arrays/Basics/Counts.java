class Counts {
    public static void main(String[] args) {
 int [] nums = {0, 1, 4, 5, -6, 0};
 int positive = 0;
 int negative = 0;
 int zeros = 0;
 for(int i = 0; i < nums . length; i++){
     if(nums [i] > 0){
         positive ++; }
     else if(nums [i] < 0){
         negative ++; }
     else{
         zeros++;  }
    }
    
System.out.println("Positive numbers: " + positive);
System.out.println("Negative numbers: " + negative);
System.out.println("Zeros: " + zeros);
}
}

output:
Positive numbers: 3
Negative numbers: 1
Zeros: 2
