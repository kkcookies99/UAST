class Solution {
    public int XXX(int x) {
        long rev=0;
        while(x!=0)
        {
        	rev=rev*10+x%10;
        	x/=10;
        	if(rev<Integer.MIN_VALUE||rev>Integer.MAX_VALUE)
        		return 0;
        }
        return (int)rev;
    }
}

