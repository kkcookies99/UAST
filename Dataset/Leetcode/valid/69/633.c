int XXX(int x){
    if(x<2)
        return x;
    int left=0;
    int right=x/2;
    long long mid;
    while(left<right)
    {
        mid=left+(right-left+1)/2;
        if(mid*mid>x)
            right=mid-1;
        else
            left=mid;
    }
    return right;
}

