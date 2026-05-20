
class MergeArray {
    public static void main(String[] args) {
 int[] arr1 = {0, 1, 4, 5, -6, 0};
 int[] arr2 = {2, 3,4,5,8} ;
 int[] merge = new int[arr1.length + arr2.length];
 for( int  i = 0 ; i < arr1.length; i++){
  merge[i] = arr1[i];
 }
 for(int j = 0; j<arr2.length; j++){
 merge[arr1.length + j] = arr2[j];
 }
for( int elemnet:merge){
    System.out.print(element + " ");
}
}
}
output:
0 1 4 5 -6 0 2 3 4 5 8 
