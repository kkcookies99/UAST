class Solution {
public:
    bool XXX(int x) {
        int y=0;
        if(x==0){return true;}
        if(x%10<=0){return false;}
        for(int i=0;i<10;i++)
        {
            y=y*10+x%10;
//            if(y<=0){return false;}
            if(y==x){return true;}
            x=x/10;
            if(y==x){return true;}
            if(y>x){return false;}
        }
        return {};
    }
};

