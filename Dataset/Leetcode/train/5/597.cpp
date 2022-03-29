 class Solution {
public:
    string XXX(string s) {
        int len=s.length();
        int i=0;
        int count=0;
        int l1=0,r1=0;
        for(i=0; i<len; i++){
            int left=i,right=i;             //如果回文串长度为奇数
            while((left>=0 && right<len) && s[left] ==  s[right]){ 
                left --;
                right ++;
            }
            if(right - left + 1 > count){
                count = right - left + 1;
                l1 = left+1;                //定位左边界
                r1 = right ;
            } 
            left = i;    
            right = i + 1;                  //如果回文串长度为偶数
            while((left>=0 && right<len) && s[left] == s[right]){   
                left --;
                right ++;
            }
            if(right - left + 1 > count){   //更新数值
                count = right - left + 1;
                l1 = left+1;                //定位左边界
                r1 = right ;
            } 
        }
            string res;
            res = s.substr(l1,r1 - l1);
            return res;
    }
};

