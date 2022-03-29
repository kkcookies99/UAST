 class Solution {
public:
    string XXX(int num) {
        string ans = "";
        int number = num / 1000;
        ans += XXX_2(number,'M','0','0');
        num %= 1000;
        number = num / 100;
        ans += XXX_2(number,'C','D','M');
        num %= 100;
        number = num / 10;
        ans += XXX_2(number,'X','L','C');
        number = num % 10;
        ans += XXX_2(number,'I','V','X');
        return ans;
    }

    string XXX_2(int num,char romanChar1,char romanChar2,char romanChar3)
    {
        string ans = "";
        if(num >= 1 && num < 4)
            ans = string(num,romanChar1);
        if(num == 4)
            ans = string(1,romanChar1) + string(1,romanChar2);
        if(num == 5)
            ans = string(1,romanChar2);
        if(num > 5 && num < 9)
            ans = string(1,romanChar2) + string(num - 5,romanChar1);
        if(num == 9)
            ans = string(1,romanChar1) + string(1,romanChar3);
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


