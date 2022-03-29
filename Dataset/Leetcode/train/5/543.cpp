 class Solution {
public:
    string XXX(string s) {
        int maxLen=1;
        string::iterator beg=s.begin(), end = s.begin();
        string::iterator i=s.begin(), j=s.begin();
        for(i=s.begin();i<s.end();i++){
            int step = maxLen;
            for(j=i+maxLen;j<s.end();j++){   
                if(is_hw(i, j)){
                    if(maxLen<j-i+1){
                        maxLen = j-i+1;
                        beg = i;
                        end = j;
                    }
                }
            }
            
        }
        string fin;
        for(string::iterator it=beg;it<end+1;it++)fin += *it;
        return fin;
    }
    bool is_hw(string::iterator i, string::iterator j){//回文判定
            while(i<=j){
                if(*i==*j){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
            return true;
        }
};
返回该题

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


