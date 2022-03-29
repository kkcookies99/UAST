class Solution {
    public int XXX(int m, int n) {
        long num=m+n-2;
        long min;
        min=m>n?n:m;
        if(min==1)return 1;
        return (int) (num(num,min-1)/num(min-1,min-1));
    }
    public static long num(long i,long j){
        if(j==1)return i;
        else return num(i-1,j-1)*i;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


