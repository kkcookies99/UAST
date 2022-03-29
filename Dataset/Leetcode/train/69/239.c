int XXX(int x){
    int l=0,r=x;
    while(l<r){
        long long mid=l+r>>1;
        if((mid+1)*(mid+1)>x&&(mid)*(mid)<=x) return mid;
        if(((mid+1)*(mid+1))==x) return mid+1;
        if((mid+1)*(mid+1)<x){l=mid; continue;} 
        if(mid*mid>x){r=mid; continue;}
    }
    return l;
}

