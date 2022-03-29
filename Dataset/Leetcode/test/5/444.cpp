 class Solution {
public:
    string XXX(string &s) {
        string t("$#");//'$'为头哨兵,'\0'为尾哨兵
        for(auto e:s){
            t+=e;
            t+='#';
        }
        vector<int> p(t.size(),1);
        int id=0,ml=0,mr=0,maxid=0;
        for(int i=1;i<t.size();++i){
            if(mr-i>1) p[i]=min(p[(id<<1)-i],mr-i);
            while(t[i+p[i]]==t[i-p[i]]) p[i]++;
            if(i+p[i]>mr) mr=i+p[id=i];
            if(p[i]>ml)ml=p[maxid=i];
        }
        return s.substr((maxid-ml)>>1,ml-1);
    }
};

