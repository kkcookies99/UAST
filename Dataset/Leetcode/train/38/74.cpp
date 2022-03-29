class Solution {
public:
    string XXX(int n) {
        if (n==1) return "1";               // n=1 返回 “1”
        else {
            string tmp=XXX(n-1);      //将n-1步的字符串记作tmp
            int count=1;                   // 计算tmp中重复的元素个数
            string res;                                 
            for(int i=0;i<tmp.size();i++) {
                char tmp1=tmp[i];                     //取第i个字符
                if (tmp1==tmp[i+1]) {                 //将其与i+1对比
                    count++;                     //如果相等，count加1，进行下次循环
                    continue;
                }
                else {                         //如果不相等，则把conut值和tmp[i]写进tmp
                    res+=char(count+48);   // char(48)='0'  相应 int conut 转变为 char 'count'
                    res+=tmp1;                           
                    count=1;                  //重置count
                }
            }
            tmp.clear();                  //清除tmp
            return res;
        }
    }
};

