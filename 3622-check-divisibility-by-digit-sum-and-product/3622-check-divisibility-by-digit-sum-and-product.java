class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int pro=1,sn=0;
        while(temp!=0)
        {
            pro=pro*(temp%10);
            sn+=temp%10;
            temp=temp/10;
        }
        if(n%(sn+pro)==0)  return true; 
        else return false;
    }
}