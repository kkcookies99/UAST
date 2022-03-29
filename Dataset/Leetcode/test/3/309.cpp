 class Solution {
public:
    int XXX(string s) {
        unordered_map<char,int> hash;
        int res=0;
        for(int i=0,j=0;i<s.length();i++){
            if(++hash[s[i]]>1){
                while(i>j){
                    hash[s[j]]--;
                    j++;
                    if(hash[s[i]]==1)break;
                }
            }
            res = max(res,i-j+1);
        }
        return res;
    }
};

