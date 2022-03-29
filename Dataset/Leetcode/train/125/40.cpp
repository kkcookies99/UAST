 class Solution {
public:
    bool XXX(string s) {
        int i=0, j=s.size()-1;
        while(i < j){
            while(i < j && tran(s[i]) == -1) i ++;
            while(i < j && tran(s[j]) == -1) j --;
            if(i < j){
                if(tran(s[i]) != tran(s[j])) return false;
                i ++; j--;
            }
        }
        return true;
    }
    
    int tran(char x){
        if((x>='a' && x<='z') || (x>='0' && x<='9')) return int(x);
        else if(x>='A' && x<='Z') return int(x+32);
        return -1;
    }
};

