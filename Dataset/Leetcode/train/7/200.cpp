class Solution {
public:
    int XXX(int x) {
        int b;
        long sum = 0;
        if(x == -2147483648 || x == 0)
            return 0;
      
        while(x/10 != 0){
          b = x%10;
          sum = b + sum*10;
          x = (x-b)/10;
        }
        sum = sum*10 + x;
        if(sum <= 2147483647 && sum>= -2147483648){
            return sum;
        }
        else{
            return 0;
        }      
      }
};

