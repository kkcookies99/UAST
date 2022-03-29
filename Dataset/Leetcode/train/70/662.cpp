class Solution {
public:

    //超时
    int fibonaci(int n)
    {
        if(n == 1 || n == 2)
            return n;
        
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
    //还行
    int lp(int n)
    {
        if(n == 1 || n == 2)
            return n;
        int sum = 0;
        int a = 1;
        int b = 2;
        for(int i = 3; i <= n; i++)
        {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    int XXX(int n) {

        return lp(n);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


