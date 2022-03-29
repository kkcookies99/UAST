 class Solution {
public:
    string XXX(string s) {
        if(s.size() == 0 || s.size()==1){
            return s;
        }
        int len=0;
        int start=0;
        int end=0;
        for(int i=0;i<s.size();i++){
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            len = max(max(len1,len2), len);
            if (len > end - start+1){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substr(start,len);

    }
    
private:
    //编写中心扩展的函数，输入中心，输出最长的长度
    int expand(string s, int left, int right){
        int l = left;
        int r = right;
        while(s[l]==s[r] && l>=0 && r<s.length()){
            l--;
            r++;
        }
        return r-l-1;
        
    }
};

