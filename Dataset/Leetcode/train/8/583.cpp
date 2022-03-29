 class Solution {
public:
    int XXX(string s) {
        bool zf = true;
        //初始状态 第一步
        bool fir = true;
        bool sec = false;
        bool third = false;
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            //第一步 检查前导空格，如果没有前导空格，则进入第二步
            if(s[i] != ' ' && fir){
                fir = false;
                sec = true;
            }
            //第二步
            if(sec){
                //检查+-，如果有则跳到下个字符并进入第三部
                if(s[i] == '+' || s[i] == '-'){
                    sec = false;
                    third = true;
                    //判断正负
                    zf = s[i] == '+' ? true : false;
                    continue;
                }
                //没有+-，直接进入第三部
                sec = false;
                third = true;
            }
            //第三步
            if(third){
                //处理数字
                if(s[i] >= '0' && s[i] <= '9'){
                    //边界判断，正负判断略有差异
                    //c++ int超出范围报错，所以在res = res * 10 + (s[i] - '0')之前，提前判断出边界
                    //负的-2147483648（0X80000000） 正的2147483647（0X7FFFFFFF）
                    if(zf){
                        if(res > 0X7FFFFFFF / 10 || res == 0X7FFFFFFF / 10 && s[i] > '7'){
                            return 0X7FFFFFFF;
                        }
                    }else{
                        if(res > 0X80000000 / 10 || res == 0X80000000 / 10 && s[i] >= '8'){
                            return 0X80000000;
                        }
                    }
                    res = res * 10 + (s[i] - '0');
                    
                }else{
                    //不是数字，结束
                    break;
                }
                
            }
        }
        return zf ? res : -res;
    }
};

