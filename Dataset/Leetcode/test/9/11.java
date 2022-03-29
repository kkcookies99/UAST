public boolean XXX(int x){
    if(x<0||(x>0&&x%10==0))
        return false;
    int ans=0;
    int length=getIntLength(x);
    while (x>ans){
        ans=ans*10+x%10;
        x=x/10;
    }
    if (length%2==0){
        if (x==ans)
            return true;
        else
            return false;
    }else {
        if(x==ans/10)
            return true;
        else
            return false;
    }
}

public int getIntLength(int m){
    int i=0;
    while (m!=0){
        m=m/10;
        i++;
    }
    return i;
}
