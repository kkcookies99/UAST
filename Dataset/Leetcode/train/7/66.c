int XXX(int x){
    int rev=0;
    while(x!=0){
        int pop=x%10;
        x/=10;
        if(rev>0x7FFFFFFF/10||rev<(int)0x80000000/10)//不加int运算时会给你强行转为unsigned
            return 0;
        rev=rev*10+pop;
    }
    return rev;
}


