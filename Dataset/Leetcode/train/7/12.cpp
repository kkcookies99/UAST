class Solution {
public:
    int XXX(int x) {
        bool flag=true;
        int res;
        if(x<0)flag=false;
        std::string s=to_string(abs(x));
        std::XXX(s.begin(),s.end());
        try{
            res=stoi(s);
        }
        catch(...){res=0;}
        if(flag)return res;
        else return -1*res;
    }
};

