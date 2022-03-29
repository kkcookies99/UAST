 public int XXX(int x) {

    if(x<0){
        return (getReverse(x*(-1)))*(-1);
    }else{
       return getReverse(x);
    }
}

public int getReverse(int x){
    long result=0;
    while(x>0){
        result=result*10+x%10;
        x=x/10;
    }
    return (int)result==result?(int)result:0;
}

