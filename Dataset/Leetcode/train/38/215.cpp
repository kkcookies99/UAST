class Solution {
public:
    string XXX(int n) {
        int i=0;
        string first="1";
        string res=first;;
        for(;i<n-1;++i)
        {
            res=func(res);                              //每次调用func函数求出下一个字符串
        }
        return res;
    }

    string func(string str){
        int count,flag=0;
        string back;
        while(str[flag]){
            count=1;                                    //记录目前字符连续出现的次数
            while(str[flag+1]&&str[flag]==str[flag+1])
            {
                count++;
                flag++;                                 //如果字符连续出现，计数器count+1
            }
            back+=to_string(count)+str[flag];           //如果不在连续，输出个数+数值
            flag++;
        }
        return back;
    }
};

