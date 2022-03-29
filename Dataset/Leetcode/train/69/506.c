int XXX(int x){
    if(x==1){
        return 1;
    }
    for(long int i=0;i<x;i++){
        if(x>=i*i&&x<(i+1)*(i+1)){
            return i;
            break;
        }
    }
    return 0;
}

