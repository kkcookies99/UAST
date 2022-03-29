int XXX(int n){
    if(n<=3){
        return n; 
    }else{
        return XXX(n-2)*2+XXX(n-3);
    }
}

