int XXX(int x){
    // 二分查找
    long left = 0, right = x;
    while(left <= right){
        long middle = (left + right) / 2;
        if(middle * middle > x)
            right = middle - 1;
        else if(middle * middle < x)
            left = middle + 1;
        else
            return middle;
    }
    return right;


//   暴力
//    long long i = 0;
//    while(i*i <= x){
//        i += 1;
//    }
//    return i-1;
}

