 class Solution {
public:
    int XXX(string s) {
        int start=-1, end=-1;
        for(int i=s.size()-1;i>=0;i--){
            if(s[i]!=' ' && start==-1) { start=i; continue;}
            if(s[i]==' ' && start!=-1) { end=i; break;}
        }
        return start-end;
    }
};

