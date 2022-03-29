 class Solution {
public:
    string XXX(int n) {
    if(n==1) return "1";
    string res= {""};

    //字符串分割
    string str = XXX(n-1);
    int len = str.size();
    int count = 1;//如果一开始相等就是2个该元素了，因为count初始为1
    for(int i = 0;i<len;i++)
    {
        //当前元素和下一元素比较，所以i只能小于len-1
        if(i<len-1 && str[i] == str[i+1])
        {
            count++;
        }
        else
        {
            res = res + to_string(count);//几个
            res = res + str[i];//该元素
            count = 1;
        }
    }
    return res;
    }
};


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


