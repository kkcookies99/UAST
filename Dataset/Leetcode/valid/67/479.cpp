class Solution {
public:
    string XXX(string a, string b) {
        //短
        string shortStr = (a.length()>b.length()?b:a);
        //长
        string lengStr = (shortStr==a?b:a);
        for(int i=0;i<shortStr.length();i++){
            lengStr[lengStr.length()-1-i]+=shortStr[shortStr.length()-1-i] ;//ascii值相加
            lengStr[lengStr.length()-1-i]-=48;
            int j=lengStr.length()-1-i;
            while(lengStr[j]>=50 && j>0){  //把非首位的2处理：自己减2 再进位
                lengStr[j]-=2;
                lengStr[j-1]++;
                j--;
            }
        }
        //只需要处理首位的2
        if(lengStr[0]>=50){
            string res="1";
            lengStr[0]-=2;
            res+=lengStr;
            return res;
        }
        return lengStr;
    }
};

