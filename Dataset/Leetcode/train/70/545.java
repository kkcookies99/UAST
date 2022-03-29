class Solution {
    public int XXX(int n) {
        return computer(n, 0);
    }

    public int computer(int n, int ret) {
        int a[] = new int[]{1,2};
        for(int i = 0; i < a.length; i++) {
            int t = n - a[i];
            if (t == 0) {
                ret++;
            } else if(t > 0) {
                ret = computer(n - a[i], ret);
            }
        }
        return ret;
    }
}

