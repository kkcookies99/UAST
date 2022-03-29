public int XXX(int x) {
    long low = 0;
    long high = x;
    long mid = (low+high)/2;

    if(x*x == x) return x;

    while(low<=high){

        if(mid*mid==x) {
            return (int)mid;

        }else if(mid*mid>x){
            high = mid;
            mid = (low+high)/2;
            if(mid*mid<x && (mid+1)*(mid+1)>x) return (int)mid;
        }else{
            low = mid;
            mid = (low+high)/2;
            if(mid*mid<x && (mid+1)*(mid+1)>x) return (int)mid;
        }
    }
    return 0;
}

