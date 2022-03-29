 class Solution {
public:
    string XXX(string a, string b) {
                map<char,int > mp1 = {
                { '0', 0 },
                { '1', 1 },};
                map<int,char > mp2 = {
                { 0, '0' },
                { 1, '1' },};         
        int gap=a.size()>b.size()?a.size()-b.size():b.size()-a.size();
        for(int i=0;i<gap;i++){
            if(a.size()>b.size())b="0"+b;
            else a="0"+a;
        }
        int flag=0;int tmp;string res;
        for(int i=a.size()-1;i>=0;i--){
            tmp=flag+mp1[a[i]]+mp1[b[i]];
            if(tmp<2){res=mp2[tmp]+res;flag=0;}
            else if(tmp==2){res='0'+res;flag=1;}
            else {res='1'+res;flag=1;}
        }
        if (flag==1)res='1'+res;
        return res;
    }
};

