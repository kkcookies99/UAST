int XXX(int x){
    if(x<=1) return x;
    int count=0;
    long y=x,mid,multi;
    while(y){//计算x的位数
        y>>=1;
        count++;
    }
    int low=0,high=count;
    while(low<=high){//二分法，跳出时high=low-1,x的平方根介于x/(2^low)到x/(2^high)之间
        mid=(low+high)/2;
        y=x;
        while(mid--){
            y>>=1;
        }
        multi=y*y;
        if(multi==x)
            return y;
        else if(multi>x){
            low=(low+high)/2+1;
        }else  
            high=(low+high)/2-1;
    }
    int lowx=x,highx=x;
    while(low--){
        lowx>>=1;
    }
    while(high--){
        highx>>=1;
    }
    //x的平方根介于lowx ~ highx之间，再用二分法
    while(lowx<=highx){
        mid=(lowx+highx)/2;
        multi=mid*mid;
        if(multi==x)
            return mid;
        else if(multi>x)
            highx=mid-1;
        else 
            lowx=mid+1;
    }
    return highx;
}

