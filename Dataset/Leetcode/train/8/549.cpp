 class Solution {
public:
    int XXX(string s) {
        int n = s.length();
        int nega = 0, index = 0; long long ans=0;
        string number="";
        
        //先跳過前導空格
        while(index < n && s[index]==' ')
        {
            index++;
        }
        if(index==n)    return 0;

        //空格後有無符號
        if(s[index]=='-' && nega==0){
            nega = -1;
            index++;
        }
        else if(s[index]=='+' && nega==0){
            nega=1;
            index++;
        }

        //數字
        for(index;index<n;index++){
            int flag = int(s[index]);
            if(flag>=48 && flag<=57)    number+=s[index];
            else break;
        }
        
        if(number == "")    return 0;
        
        for(auto c:number){
            ans = ans * 10;
            if(ans > 2147483647) break; 
            ans += int(c)-48;
        }
        ans = nega==-1? -ans : ans;

        if(ans < -2147483648)   ans = -2147483648;
        else if(ans > 2147483647) ans = 2147483647;

        return ans;
        
        
    }
};

