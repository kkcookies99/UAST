class Solution {
public:
    string XXX(int n) {
        if(n==1) return "1";
        string tmp=XXX(n-1);

        
        string res;
        char cur=tmp[0];
        int index=0;
        while(index<tmp.size()){
            int count=0;
            //找相同且连续的数字
            while(index<tmp.size()&&tmp[index]==cur){
                count++;
                index++;
            }
            res+=to_string(count)+cur;
            cur=tmp[index];
        }
        return res;

    }
};

