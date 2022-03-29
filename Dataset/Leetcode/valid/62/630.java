class Solution {
    public int XXX(int m, int n) {
        int num=1;
		if((1+1<=m&&1+1>n)||(1+1>m&&1+1<=n))
			num=1;
		if(1+1<=m&&1+1<=n) {
			num=XXX(m-1,n)+XXX(m,n-1);
		}
       return num;
    }
    }

