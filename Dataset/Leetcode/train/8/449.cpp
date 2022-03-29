 class Solution {
public:
    int XXX(string s) {
        int res=0;
        int n=s.size();
        int idx=0;
        //丢弃无用的前导空格
       while(idx<n&&s[idx]==' ') idx++;

        //若已到达结尾
       if(idx==n) return res;

       //检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）
       bool postive=true;
       if(s[idx]=='-'){
           postive=false;
           idx++;
       }
       else if(s[idx]=='+') idx++;
       else if(s[idx]<'0'&&s[idx]>'9') return res;

        //将前面步骤读入的这些数字转换为整数
       while(idx<n&&s[idx]>='0'&&s[idx]<='9'){
           int curnum=s[idx]-'0';
           if(res>(INT_MAX-curnum)/10)//res*10+curnum>INT_MAX
                return postive?INT_MAX:INT_MIN;
          res=res*10+curnum;
          idx++;
       }
          return postive?res:-res;
     }     
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


