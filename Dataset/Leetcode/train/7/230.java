public int XXX(int x) {
    int sign=1 ;
    if(x<0)
    {
        sign=-1;
    }
    int n =x*sign;
    int rs = 0;
     while(n>0)
    {
        int temp = n%10;
        n =n/10;
        int temp1 = rs;
        rs = rs*10+temp;
        if(rs/10!=temp1)
            return 0;

    }
    rs= rs*sign;
    return rs;
    

}

