class Solution {
public:
    bool XXX(int x) {
        if (x < 0) return false;
        else if (x >= 0 && x < 10) return true;
        else if (x % 10 == 0) return false;

        int tmp = x;
        unsigned int run = 0; // 必须这么搞，不然会报错
        while(tmp != 0)
        {
            run = run * 10 + tmp % 10;
            tmp /= 10;
        }

        return (run == x);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

