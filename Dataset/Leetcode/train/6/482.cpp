 class Solution {
public:
    string XXX(string s, int numRows) {
        string ss;
        //迭代k行
        //除了首行和尾行是增量2*nrow-2
        //其他增量交替为：（n-k-1）*2 ｜ k*2
        int len = s.size();
        if(len<=numRows||numRows==1) return s;
        for(int k=0;k<numRows;k++)
        {
            int tmp_cnt=k;
            int adder = 0;//判断是奇数还是偶数的加
            while(tmp_cnt<len){
                if(k == 0 || k == numRows-1)
                {
                    ss+=s.substr(tmp_cnt,1);
                    tmp_cnt+=2*numRows-2;
                }
                else
                {
                    ss += s.substr(tmp_cnt,1);
                    if(adder%2 == 0)tmp_cnt+=2*numRows-2*k-2;
                    else tmp_cnt+=2*k;
                    adder+=1;
                }
            }
            // cout<<ss<<endl;
        }
        return ss;
    }
};

