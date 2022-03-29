int XXX(int n){
    if(n < 0){
        return 0;
    }
    if(n==1 || n==0){
        return 1;
    }else{
        return XXX(n-1) + XXX(n-2);
    }
}

