 class Solution {
    public int XXX(int x) {
        long result=0;
        while (x!=0){
            result=result*10+x%10;
            x/=10;
        }
        return (int)result==result?(int)result:0;
    }
}

