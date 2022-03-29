 class Solution {
public:
    string XXX(string s) {
        int len = s.length();
        if(len == 0) return "";
        int *odd = new int[len];  // 奇数长度的子字符串
        int *even = new int[len];  // 偶数长度的子字符串
        for(int i=0; i<len; ++i){
            // 奇
            int sublen = 1;
            while(i+sublen<len && i-sublen>=0 && s[i+sublen] == s[i-sublen]) ++sublen;
            odd[i] = sublen-1;
            // 偶
            sublen = 1;
            while(i-sublen>=0 && i+sublen-1<len && s[i+sublen-1]==s[i-sublen]) ++sublen;
            even[i] = sublen-1;
        }
        
        int maxoddlen=-1, maxevenlen=-1, oddcenter=-1, evencenter=-1;
        for(int i=0; i<len; ++i){
            if(odd[i] > maxoddlen){
                maxoddlen = odd[i];
                oddcenter = i;
            }
            if(even[i] > maxevenlen){
                maxevenlen = even[i];
                evencenter = i;
            }
        }
        if(2*maxoddlen+1 > 2*maxevenlen){
            return s.substr(oddcenter-maxoddlen, 2*maxoddlen+1);
        }else{
            return s.substr(evencenter-maxevenlen, 2*maxevenlen);
        }
    }
};

