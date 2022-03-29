 class Solution {
public:
    string XXX(string s) {
      vector<vector<int>> dp(s.size(),vector<int>(s.size(),0));// 创建二维数组 初始化为0
      int maxlength=0;  //存储最大长度
      int left=0;       //回文串左端
      int right=0;      //回文串右端
      for(int i=s.size()-1;i>=0;i--)  //i和j 表示要检查的字符串的两端位置，i从上到下 j从左到右 主对角线右上方
      {
          for(int j=i;j<s.size();j++)
          {
              if(s[i]==s[j] && (j-i<=1 || dp[i+1][j-1])) //字符串两端相等，同时内部也是一个回文串，新构成的字符串     也是回文的
                dp[i][j]=1;
              if(dp[i][j] && j-i+1>maxlength) //如果回文，并且产生的长度最大，更新maxlength
               {
                 maxlength=j-i+1;    
                 left=i;
                 right=j;
               }
          }

      }
              return s.substr(left,maxlength); //返回最大长度的回文串
    }
};


