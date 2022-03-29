class Solution {
    public int XXX(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int p = 0, q = 1, r = 2;
        for (int i = 3; i <= n; i++) {
            p = q;
            q = r;
            r = p+q;
        }
        return r;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


