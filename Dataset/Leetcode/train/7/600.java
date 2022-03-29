 class Solution {
    public int XXX(int x) {
        int res = 0;
        if (x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE || x == 0) return 0;
        while (x != 0){
            res = res * 10 + x % 10;
            x /= 10;
            if (x / 10 == 0 && x != 0){
                if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) return 0;
                if (res == Integer.MAX_VALUE / 10 && x > 7) return 0;
                if (res == Integer.MIN_VALUE / 10 && x < -8) return 0;
            }
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


