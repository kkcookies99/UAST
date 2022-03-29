    public int XXX(int n) {
        int[] res = new int[]{2, 1};
        for (int i = 3; i <= n; i++) {
            res[i&1] = res[(i-1)&1] + res[(i-2)&1];
        }
        return res[n&1];
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


