class Solution {
    public int XXX(int n) {
        int f1 = 1,f2 = 2;
        if(n==1) return f1;
        if(n==2) return f2;
        for(int i=3;i<=n;i++) {
            int temp = f1+f2;
            f1 = f2;
            f2 = temp; 
        }return f2;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


