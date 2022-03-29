 class Solution {
public:
    string XXX(int num) {
        int q = num / 1000;
        num = num % 1000;
        int b = num / 100;
        num %= 100;
        int s = num / 10;
        num %= 10;
        int g = num;
        string res;
        // 转换千位
        while(q--) res.push_back('M');
        // 转换百位
        if(b<4){while(b--) res.push_back('C');}
        else if(b==4){b=0; res.push_back('C'); res.push_back('D');}
        else if(b>=5 && b<9){res.push_back('D'); b-=5; while(b--) res.push_back('C');}
        else if(b==9){b = 0; res.push_back('C'); res.push_back('M');}
        // 转化十位
        if(s<4){while(s--) res.push_back('X');}
        else if(s==4){s=0; res.push_back('X'); res.push_back('L');}
        else if(s>=5 && s<9){res.push_back('L'); s-=5; while(s--) res.push_back('X');}
        else if(s==9){s = 0; res.push_back('X'); res.push_back('C');}
        // 转换个位
        if(g<4){while(g--) res.push_back('I');}
        else if(g==4){g=0; res.push_back('I'); res.push_back('V');}
        else if(g>=5 && g<9){res.push_back('V'); g-=5; while(g--) res.push_back('I');}
        else if(g==9){g = 0; res.push_back('I'); res.push_back('X');}

        return res;
    }
};

