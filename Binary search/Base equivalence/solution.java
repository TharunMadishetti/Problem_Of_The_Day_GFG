//Problem link : https://practice.geeksforgeeks.org/problems/base-equivalence1022/1
class Solution
{
    String baseEquiv(int n, int m)
    {
        // code here
        int l=2,h=32;
    while(l<=h){
    int i=(l+h)/2;
    int c=0;
    int temp=n;
    while(temp!=0)
    {
        c++;
        temp=temp/i;
 
    }
    if(c==m)
    return "Yes";
    else if(c>m)
    l=i+1;
    else
    h=i-1;
}
return "No";
    }
}
