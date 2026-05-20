class CopyArray {
    public static void main(String[] args) {
 int [] nums = {0, 1, 4, 5, -6, 0};
 int [] temp = new int [nums.length] ;
 for( int  i = 0 ; i < nums.length; i++){
temp[i] = nums[i];
System.out.println(temp[i]);
 }
 
}
}

output:
0 1 4 5 -6 0
