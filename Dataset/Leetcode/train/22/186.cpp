 class Solution {
public:
    vector<string> res;
    vector<string> XXX(int n) {
        generate("",n,n);
        return res;
    }
    void generate(string str,int leftnum,int rightnum){
        if(rightnum==0){
            res.push_back(str);
            return;
        }
        if(leftnum>0)
            generate(str+"(",leftnum-1,rightnum);
        if(rightnum>leftnum)
            generate(str+")",leftnum,rightnum-1);
    }
};

