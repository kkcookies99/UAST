 public int XXX(int x) { 
        if (x==0) return 0;
       int rd= Math.max(x,1);
       int ld = 1;
       int mid = ld+(rd-ld)/2;
       while ( !((long)mid*mid<=x&&(long)(mid+1)*(mid+1)>x)){
           if ((long)mid * mid >x){
               rd = mid-1;
           }else {
               ld = mid+1;
           }
           mid =  ld+(rd-ld)/2;
       }
       return mid;
