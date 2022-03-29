int XXX(int n){
    int a[100];
    int i=0;
    a[0]=1;
    a[1]=2;
    for(i=2;i<n;i++)
    {
        a[i]=a[i-1]+a[i-2];
    }
    return a[n-1];
    

}

