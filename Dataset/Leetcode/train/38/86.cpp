class Solution {
public:
    string XXX(int n) {
        string str="1";
        if(n==1) return str;
        int i,j;
        for(i=1;i<n;i++){
            string temp="";
            char ch=str[0];
            int count=0;
            for(j=0;j<str.size();j++){
                if(str[j]==ch){
                    count++;
                    continue;
                }
                else{
                    temp+=('0'+count);
                    temp+=ch;
                    ch=str[j];
                    count=1;
                }
            }
            if(count>0){
                temp+=('0'+count);
                    temp+=ch;
            }
            str=temp;
        }
        return str;
    }
};

