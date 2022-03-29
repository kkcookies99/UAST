int XXX(int x){
    if(x < 2)   return x;
    long a = 1;
    while(a*a < x){
        a++;
    }
    if(a*a == x)    return a;
    return a - 1;
}

