int XXX(int x){
    long n=0;
    while(x!=0){
        n=n*10+x%10;
        x=x/10;
    }
    if(n>2147483647||n<-2147483648)  return 0;
    else return n;
}

