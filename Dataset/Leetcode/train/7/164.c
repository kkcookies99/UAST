int XXX(int x){
    int temp = 1, num = 0;

    if(x < -2147483512 || x > 2147483512)
        return 0;
    
    if(x < 0){
        temp = -1;
        x = -x;
    }
    
    while(x != 0){        
        if(num > 214748364){
            printf("%d", num);
            return 0;
        }
        else if(num == 214748364){
            if(temp == -1 && x > 8)
                return 0;
            else if(temp == 1 && x > 7)
                return 0;
        }
        
        num = num * 10 + x % 10;
        
        x /= 10;
    }
    
    return num*temp;
}

