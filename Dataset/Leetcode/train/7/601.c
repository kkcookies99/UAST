 int XXX(int x){
   int y = 0;
   while (x != 0){ 
       y = y * 10 + x % 10;
       x = x / 10;
    if (y>2147483647 || y<-2147483648){
        return 0;
    }
各位大佬看看我这样对吗？输出结果是对的，但我觉得少了啥。
    
    }
   return y;
}

