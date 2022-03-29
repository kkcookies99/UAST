    public int XXX(int x) {
    	long low=0;
    	long high=x;
    	long mid=0;
    	while(low<high) {
    		mid=(low+high)/2;
    		if(mid*mid<x) low=mid+1;
    		else  high=mid;
    	}
    	return (low*low>x?-1:0)+(int)low;
    }

