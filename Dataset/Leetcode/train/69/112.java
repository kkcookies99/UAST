   public int XXX(int x) {

       if(x<=1) return x;
       long i=0; 
       long s=0;
       
       while(s<=x){
           i++;
           s=i*i; 
       }
       return (int)i-1;

    }

