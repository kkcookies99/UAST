 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size()==0)  //0,1个字符的判断
            return "";
        else if(strs.size()==1)
            return strs[0];
        int count = strs.size()-1;  //vector容器的个数-1
        string res;
        int flag=0,j=0;  //flag:字符是否遍历完，j下标，遍历string字符的每个字符
        for(int c=0;c<strs[0].size();c++)  //只运行第一个字符长度的循环，可自行优化
        {
            for(int i=0;i<count;i++)  //个数循环
            {
                if(strs[i][j]==strs[i+1][j])  //前缀相同
                    flag++;
                else
                {
                    res += "";  //不相同
                    return res;
                }
                if(flag==count)  //相同且对比完
                {
                    res += strs[0][j];  //存储前缀
                    j++;  //下标+1
                }
            }
            flag=0;  //重置遍历标志
        }
        return res;
    }
};

