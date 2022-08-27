class Solution {
   void rearrange(int arr[], int n) {
       // code here
       ArrayList<Integer> positive = new ArrayList<>();
       ArrayList<Integer> negative = new ArrayList<>();
       for(int i=0; i<n; i++){
           if(arr[i] < 0){
               negative.add(arr[i]);
           }else{
               positive.add(arr[i]);
           }
       }
       int[] result= new int[n];
       int i=0, j=0,k=0;
       while(i<positive.size() || j< negative.size()){
           if(i< positive.size()){
               result[k] = positive.get(i);
               i++;
               k++;
           }
           if(j< negative.size()){
               result[k] = negative.get(j);
               j++;
               k++;
           }
       }
       for( i=0; i<n; i++){
           arr[i] = result[i];
       }
   }
}
