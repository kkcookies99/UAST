 class Solution {
public:
    bool XXX(string s) {
        int n = s.size();
        string str = "";
        for(int i = 0; i < n; i++){
            if((s[i] >= 65 && s[i] <= 90 )|| (s[i] >= 97 && s[i] <=122) || (s[i]>= 48 && s[i] <=57) ){
                if(s[i] >= 65 && s[i] <= 90)  s[i]+=32;
                str+=s[i];
            }
        }
        int i = 0;
        int j = str.size()-1;
        while(i <= j){
            if(str[i]==str[j]){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
};

