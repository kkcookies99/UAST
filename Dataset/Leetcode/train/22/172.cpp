 class Solution {
public:
    vector<string> res;
    vector<string> XXX(int n) {
        string tmp;
        genSequence(tmp,0,0,n);
        return res;
    }
    //lb:已在序列的左括号的个数
    //rb:可插入的右括号的个数
    void genSequence(string &tmp,int lb,int rb,int &n){
        if(tmp.size()==2*n){
            res.push_back(tmp);
            return;
        }
        if(lb<n){
            tmp+='(';
            genSequence(tmp,lb+1,rb+1,n);
            tmp.pop_back();
        }
        if(rb){
            tmp+=')';
            genSequence(tmp,lb,rb-1,n);
            tmp.pop_back();
        }
    }
};

