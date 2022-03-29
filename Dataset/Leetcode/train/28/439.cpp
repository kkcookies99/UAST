 class Solution {
public:
    int XXX(string haystack, string needle) {
        int m = haystack.size();
        int n = needle.size();
        if(n==0){
            return 0;
        }
        if(m==0){
            return -1;
        }
        for(int i=0;i+n<m+1;i++){
            bool flag = true;                           //这里设置一个flag标志，如果不设置，“return i”语句就无法在正确的条件下被执行（成功匹配），而是在小循环不匹配(被break)后被直接执行，即遇到了不匹配后直接返回当前i的值，显然是不正确的
            for(int j=0;j<n;j++){
                if(needle[j]!=haystack[i+j]){
                    flag = false;               
                    break;                              
                }            
            }                                            //只有pattern模式串与text文本串完全匹配成功（小循环未发生break）时，才能返回i的值，需要用flag来区分小循环的结束，到底是由匹配成功即循环顺利走完造成的，还是由不匹配发生break强行结束造成的,flag标志能够区分出这两种情况
            if(flag==true){
                return i;
            }
        }
        return -1;
        
    }
};

