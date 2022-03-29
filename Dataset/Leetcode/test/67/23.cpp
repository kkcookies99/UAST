 class Solution {
public:
    string XXX(string a, string b) {
        int a_size = a.size(),b_size = b.size(),d=0,sum;
        string ans = "";
        if(a_size < b_size){
            a.insert(0,b_size - a_size,'0');
        }
        else{
            b.insert(0,a_size - b_size,'0');
        }
        for(int i = a.size()-1;i>=0;i--){
            sum = a.at(i) + b.at(i) - 96 + d;
            d = sum >> 1;
            sum &= 1;
            ans.insert(0,1,sum + '0');
        }
        if(d){
            ans.insert(0,1,'1');
        }
        return ans;
    }
};

