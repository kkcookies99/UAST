class Solution {
public:
    long transint(string s){
        long sum = 0;
        for(int i = 0; i < s.size(); i++){
            sum = 10*sum + s[i]-48;
            if(sum > INT_MAX)  return sum;
        }
        return sum;
    }

    int XXX(string s) {
        int i = 0;
        int flag = 0;
        string str = "";
        while(i < s.size()){
           while(i < s.size() && s[i]==' ')   i++;   //去掉空格
           if(i < s.size() && s[i]=='-'){            //判断符号‘-’;
               flag = 1;
               i++;
           }
           else if(i < s.size() && s[i]=='+') i++;   //判断正号‘+’;
           if(i < s.size() && s[i] < '0' && s[i] > '9')  return 0;   //判断是否是字符符号开头？？？
           while(i < s.size() && s[i] >= '0' && s[i] <= '9'){        //以上不合法的情况排除后，开始记录数字字符串；
               str+=s[i++];
           }
           break;
        }
        long sum = transint(str);                                    //最后处理字符串，转换为范围内数字；
        if(flag && sum > INT_MAX)  return INT_MIN;
        if(!flag && sum >= INT_MAX) return INT_MAX;
        return flag==1 ? (-1)*sum : sum;
    }
};

