int XXX(int x){
    if(x == 0) {
        return 0;
    }
    long i = 1;
    for(i = 1; 1; i++) {
        if(i*i <= x && (i+1)*(i+1)>x) {
            return i;
        }
    }
}

