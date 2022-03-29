class Solution {
public:
    int XXX(string s) {
        int l = 0, r = 0; 
        int maxlen = 0;
        
        for( ; r < s.size(); r++ ) {
            for( int k = l; k < r; k++ ) // 检查新元素是否在窗口内出现过
                if( s[r] == s[k] ) { // s[r]为新元素
                    l = k+1;
                    break; // 重新设置左边界后，就可以检查下一个新元素了
                }
            if(r-l+1 > maxlen)
                maxlen = r-l+1;     
            }
        return maxlen;
    }
};


