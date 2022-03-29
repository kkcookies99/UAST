 class Solution {
public:
    string XXX(int num) {
        string qian[4] = {"*","M","MM","MMM"};
        string bai[10] = {"*","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        string shi[10] = {"*","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        string ge[10] = {"*","I","II","III","IV","V","VI","VII","VIII","IX"};
        string ans;
        int temp = num / 1000;
        num %= 1000;
        if(temp != 0) ans += qian[temp];
        temp = num / 100;
        num %= 100;
        if(temp != 0) ans += bai[temp];
        temp = num / 10;
        num %= 10;
        if(temp != 0) ans += shi[temp];
        if(num != 0) ans += ge[num];
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


