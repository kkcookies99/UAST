int XXX(int n){
    if(n==1)
       return 1;
    else if(n==2)
       return 2;
    int a=1,b=2;
    for(int i=2;i<n;i++){
        b = a + b;
        a = b - a;
    }
    return b;
}

