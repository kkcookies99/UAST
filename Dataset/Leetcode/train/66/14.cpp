 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
//模拟进位
     int size=digits.size();
     int c=1;//进位符
     int i=size-1;
     while(c&&i>=0){
         digits[i]+=c;
         c=digits[i]/10;
         digits[i]%=10;
         i--;
     }
     if(c){
         digits.insert(digits.begin(),c);
     }
     return digits;
    }
};

