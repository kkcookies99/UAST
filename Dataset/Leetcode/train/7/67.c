int XXX(int x){
int y = 0;
int max = 2147483647;
int min = -2147483648;
int lastMax = max % 10;
int lastMin = min % 10;
while(x != 0){
   if(y < max / 10 && y > min / 10){
     y = 10 * y + (x % 10);
     x = x / 10;   
    }else if ((y == max / 10  &&  x / 10 <=lastMax)|| (y == min / 10 && x / 10 >=lastMin)){
     y = 10 * y + (x % 10);
     x = x / 10;   
    } else{
        y = 0;
        break;
    }
}
return y;
}



