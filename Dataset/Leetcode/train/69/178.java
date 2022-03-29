public int XXX(int x) {
    if (x == 0) {
        return 0;
    }
    int begin = 1;
    int end = x>=46341 ? 46341:x;
    while(true){
        if(end-1 == begin){
            return begin;
        }
        int min = (end+begin)/2;
        if(x> min*min){
            begin = min;
        }else if(x <min*min){
            end = min;
        }else {
            return min;
        }
    }
}
