 class Solution {
public:
    string XXX(int n) {
        string s="1";
        while(n>1){
            n--;
            string temp;
            int count=1,i=1;
            for(i=1;i<s.length();i++){
                if(s[i-1]==s[i])count++;
                else{
                    temp+=to_string(count);
                    temp+=s[i-1];
                    count=1;
                }
            }
            temp+=to_string(count);
            temp+=s[i-1];
            s=temp;
        }
        return s;
    }
};

