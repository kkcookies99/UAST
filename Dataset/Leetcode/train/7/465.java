 class Solution {
    public int XXX(int x) {
        long n = 0;
        while(x != 0){
            n = n * 10 + x % 10;
            x /= 10;
        }
        return n > Integer.MAX_VALUE || n < Integer.MIN_VALUE ? 0 : (int)n;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


