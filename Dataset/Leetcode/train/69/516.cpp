class Solution {
public:
    int XXX(int x) {
        int n = x / 2, i;
        for (i = 0; i <= n; i++){
            if (x < pow(i+1, 2) && pow(i, 2) <= x)
                break;
        }
        return i;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


