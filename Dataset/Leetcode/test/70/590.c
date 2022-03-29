int XXX(int n){
    int sum[n+1];
    for(int i = 0 ; i<= n ; i++)
    {
       if(i <= 3)
       {
           sum[i] = i;
           continue;
       }

       sum[i] = sum[i-1] + sum[i-2];
    }
    return sum[n];

}

