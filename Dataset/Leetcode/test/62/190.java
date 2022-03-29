 class Solution {
    public int XXX(int m, int n) {
      /*我们要算的是Cm+n-1 m-1
        * 也就是(m+n-2)*(m+n-3)....(n)/(m-1)!*/

       
        /*分步骤*/
       /*
        long a=1;
        long b=1;
        for (int i =n+m-2; i >=n ; i--) {
            a=a*i;
        }
        for (int i = 1; i <= m - 1; i++) {
            b=b*i;
        }*/
        /*合并,为什么要合并,因为单独和分母或分子可能超出数据类型的范围
        * 通过合并相除缩小结果,只要m n不要太大就不会m/n就不会超出范围*/
        long res=1;
        for (int x=n, y=1;y<m;y++,x++){
            res=res*x/y;
        }
        return (int)res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


