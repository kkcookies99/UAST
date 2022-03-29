class Solution {
public:
    string waiguan(string n){
        string res;//结果字符串
        int count=0;//计数器
        char a=n[0];//保存当前字符
        for(int i=0;i<n.size();i++){
            if(n[i]==a){
                count++;//要是字符相同计数器加一
            }else{
                res+=to_string(count);
                res+=a;
                a=n[i];
                count=1;//字符不同 将计数器和字符放入结果
            }
        }
        res+=to_string(count);
        res+=a;//最后一组数字循环内不会放入 手动放入
        return res;
    }
    string XXX(int n) {
        if(n==1) {
            return "1";
        }else{
            return waiguan(XXX(n-1));//迭代n次
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


