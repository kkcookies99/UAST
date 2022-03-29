 class Solution {
public:
    inline bool letter(char c){
        return c>='0'&&c<='9' || c<='z'&&c>='a' || c<='Z'&&c>='A';
    } 
    bool XXX(string s) {
        int n = s.size();
        
        int i=0,j=n-1;
        while(i<j){
            if(s[i]==s[j]){
                i++;
                j--;
            }else if ( !letter(s[i]) ){
                i++;
            }else if ( !letter(s[j]) ){
                j--;
            }else if(s[i]>='0'&&s[i]<='9' || s[j]>='0'&&s[j]<='9'){
                if(s[i]==s[j]) {
                    i++;j--;
                }else return false;
            }else if(32==abs(s[i]-s[j])){
                i++;
                j--;
            }
            else return false;
            //cout<<i<<j<<endl;
        }
        return true;
    }
};

