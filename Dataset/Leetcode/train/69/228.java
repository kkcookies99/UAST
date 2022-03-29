class Solution {
    public int XXX(int x) {
        int result=0;
        for(int i=1;i<=x;i++)
            if(i*i<=x && (long)i*i+2*i+1>x)
            {
                result=i;
                break;
            }
        return result;
        
    }
}

