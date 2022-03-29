 class Solution {
public:
    bool XXX(string s) {
       int pos1 = 0;
       int pos2 = s.size()-1;
       while(pos1<pos2){
            while(pos1<pos2&&!(s[pos1]>='a'&&s[pos1]<='z'
            ||s[pos1]>='A'&&s[pos1]<='Z'||s[pos1]>='0'&&s[pos1]<='9'))
               pos1++;
            while(pos1<pos2&&!(s[pos2]>='a'&&s[pos2]<='z'
            ||s[pos2]>='A'&&s[pos2]<='Z'||s[pos2]>='0'&&s[pos2]<='9'))
                pos2--;
            char tmp1;
            char tmp2;
            if(s[pos1]>='A'&&s[pos1]<='Z')
                tmp1 = tolower(s[pos1]);
            else
                tmp1 = s[pos1];
            if(s[pos2]>='A'&&s[pos2]<='Z')
                tmp2 = tolower(s[pos2]);
            else
                tmp2 = s[pos2];
            if(tmp1!=tmp2)
                return false;
            pos1++;
            pos2--;
       } 
       return true;
    }
};

