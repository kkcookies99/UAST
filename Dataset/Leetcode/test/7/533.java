 public int XXX(int x) {
    if(x==0)return 0;
    double y=0;
    while(x!=0)
    {
        y=y*10+x%10;
        x=x/10;
    }
     if(y>=Integer.MAX_VALUE||y<=Integer.MIN_VALUE)return 0;
         return  (int)y;
    
}

