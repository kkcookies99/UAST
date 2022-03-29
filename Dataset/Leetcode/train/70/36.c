int XXX(int n){
    if(n==0 || n==1){
        return 1;
    }else{
        return XXX(n-1) + XXX(n-2);
    }
}

