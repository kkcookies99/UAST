int XXX(int n){
    if (n==1) return 1;
    if (n==2) return 2;
    int *dp_stairs = (int *)calloc(n+1,sizeof(int));
    dp_stairs[1] = 1;
    dp_stairs[2] = 2;
    for(int i = 3;i <= n; i++){
        dp_stairs[i] = dp_stairs[i-1] + dp_stairs[i-2];
    }
    return dp_stairs[n];
}


