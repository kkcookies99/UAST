class Solution {
    public int XXX(int n) {
	        int t = n/2;
	        int c = 1;
	        while(t>0){
	            int x = n-(t*2)+t;
	            double y =1;
	            int to=t;
	            if(t==x) {
	            	y=1;
	            	to=0;
	            }
	            else if(t*2>x)
	            	to=(x-t)；
	            while(to>0){
	                y=y*x/to;
	                x--;
	                to--;
	            }
                    if(y%1>0.5)
	            	y+=1;
	            c+=(int)y;
	            t=t-1;
	        }
	    return c;
    }
}

