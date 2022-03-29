 class Solution {//时间O(n) 空间O(1) c++ 32ms
public:
string XXX(string s) {
    int len = s.size(),max = 0;
    int r_lo = 0;
    for(int i=1;i<len;++i){
        int lo = i,hi =i;
        while(lo>=0 && hi<=len &&s[lo]==s[hi]){//从左到右遍历aba型的回文
            if(max<hi-lo){//记录最大回文串长度并记录该串的秩
                max = hi-lo;
                r_lo = lo;
            }
            lo--;
            hi++;
        }
        lo = i-1;hi = i;
        while(lo>=0 && hi<=len &&s[lo]==s[hi]){//遍历abba型的回文串，其余同上
            if(max<hi-lo){
                max = hi-lo;
                r_lo = lo;
            }
            lo--;
            hi++;
        }
    }
    string s1(s,r_lo,max+1);//构造输出回文串
    return s1;
    }
};

