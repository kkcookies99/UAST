class Solution {
    public int XXX(int x) {
        if(x==1) return 1;
        int res=0;
	for (long i=1; i < x/2+1; i++) {
	    if(i*i<=x&&(i+1)*(i+1)>x){
		res = (int)i;
                break;
	    }
	}
	return res;
    }
}

