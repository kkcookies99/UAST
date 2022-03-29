 public int XXX(int x) {
        boolean flag=false;
        if(x<0) {x=-x; flag=true;}
        long tmp=0;
        while(x!=0){
            tmp*=10;
            tmp+=x%10;
            x/=10;
        }
        if(flag) tmp=-tmp;
        if(tmp>=Integer.MIN_VALUE&&tmp<=Integer.MAX_VALUE){
            return (int)tmp;
        }else{
            return 0;
        }
    }


