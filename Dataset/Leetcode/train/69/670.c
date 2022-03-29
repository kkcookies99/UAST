int XXX(int x){
    int begin=0,end=x;
    while( 1 ){
        long mid = begin + (end-begin)/2;
        if( mid*mid <= x && (mid+1)*(mid+1) > x ){
            return mid;
        }
        else {
            if( mid*mid > x ) end = mid - 1;
            if( (mid+1)*(mid+1) <= x ) begin = mid + 1;
        }
    }
}

