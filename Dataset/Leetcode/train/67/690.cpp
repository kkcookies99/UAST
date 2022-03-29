class Solution {
public:
    string XXX(string a, string b) {
        if (a.size() < b.size()){a.insert(0,b.size()-a.size(),'0');}
        else {b.insert(0,a.size()-b.size(),'0');}
        string result;
        int upp=0,sum=0,upd=0;
        for(int i = a.size()-1;i>=0;i--){
            if (a[i] != b[i]) {sum = 1;}
            else if(a[i] == '1'){upp = 1;}

            if (sum && upd) {result.insert(0,1,'0');upp = 1;}
            else if (sum || upd){result.insert(0,1,'1');}
            else{result.insert(0,1,'0');}
            upd = upp;
            sum = 0;
            upp = 0;
        }
        if(upd){result.insert(0,1,'1');}
        return result;
    }
};

