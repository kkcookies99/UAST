class Solution {
    public int XXX(int x) {
	int flag=1;
	long n=0;
	if (x<0) {
		flag=-1;
		x=-x;
	}
	while (x>0) {	
	n=n*10+x%10;
	x/=10;
	}
	if (flag==-1) {
		n=-n;
	}
	if (n<=Integer.MAX_VALUE&&n>=Integer.MIN_VALUE) {
		return (int)n;
	}
	
	return 0;
    }
}

