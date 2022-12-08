//Problem link: https://practice.geeksforgeeks.org/problems/3-divisors3942/1
class Solution{ 
    static TreeMap<Long,Integer> primes(){
       TreeMap<Long,Integer> h= new TreeMap<>();
       boolean[] p=new boolean[1000001]; 
       
       for(int i=2;i<=1000000;i++)
       {
           if(!p[i])
           {
               int j=2;
               h.put((long)i*i,h.size()+1);
               while(i*j<=1000000){
                   p[i*j]=true;
                   j++;
               }
           } 
          
       } 
       return h;
    }
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
       TreeMap<Long,Integer> h=primes();
       ArrayList<Integer> ans=new ArrayList<>();
       h.put(0L,0);
       for(long x: query)
       if(h.floorKey(x)!=null )
       ans.add(h.get(h.floorKey(x))); 
    //   System.out.println(h);
       return ans;
    }
}
