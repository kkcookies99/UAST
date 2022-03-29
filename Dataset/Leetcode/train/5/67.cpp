 class Solution {
public:
    int length=0; //设置几个全局变量 保存回文串的起始位置和长度
    int left=0;
    int right=0;
    void extend(string &s,int i,int j,int n)
    {
        while(i>=0&&j<s.size()&&s[i]==s[j]) //判断左右是否相等
        {
            if(j-i+1>length) //更新回文串
            {
                left=i;
                right=j;
                length=j-i+1;
            }
            i--;
            j++;
        }
    }
    string XXX(string s) {
        for(int i=0;i<s.size();i++)
        {
            extend(s,i,i,s.size()); //从第一个开始 以一个字母为中心
            extend(s,i,i+1,s.size());   //以两个字母为中心
        }
        return s.substr(left,length);   //返回回文串
    }
};

	

