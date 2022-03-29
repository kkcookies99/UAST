 class Solution {
public:
//常规
    string XXX(int n) {
        string s="1";
        int count;
        while(n>1){
            n--;
            string temp="";
            count=1;
            int j=0;
            for(int i=1;i<s.length();i++){
                if(s[i]==s[j])count++;
                else{
                    temp=temp+to_string(count)+s[j];
                    j=i;
                    count=1;
                }
            }
            s=temp+to_string(count)+s[s.length()-1];
        }
        return s;
    }
};

