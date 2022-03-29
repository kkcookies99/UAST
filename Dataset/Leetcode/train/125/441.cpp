 class Solution {
public:
    bool XXX(string s) {
        
        // 传入参数为形参，可以随意更改
        int len = s.length();
        int index = 0;
        for( int i = 0 ; i < len ; i ++ )     // 统一口径
            if( s[i] >= 'a' && s[i] <= 'z') 
                s[index++] = s[i]&0xDF;
            else if( (s[i] >= '0' && s[i] <= '9') ||(s[i] >= 'A' && s[i] <= 'Z'))
                s[index++] = s[i];
        
        int i = 0 ; 
        int j = index-1 ;
        while( i < j ){     // i = j 位置的字母可以不判断 ， i > j 时已经无需判断
            
            if( s[i] != s[j] )
                return false;
            ++ i; 
            -- j;
        }

        return true;        // i >= j 时，正常退出情况为回文串
    }
};

