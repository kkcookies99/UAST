class Solution {
public:
    // C(m+n-2,n-1)
    int XXX(int m, int n) {
        return C(m+n-2,min(m-1,n-1));
    }
    /*int C(int n,int m){ //递归求C（m,n）
        if(m==0 ||n==m) return 1;
        if(m==1) return n;
        return C(n-1,m)+C(n-1,m-1);
    }*/
    int C(int n,int m){ //迭代求
        long long ans=1;
        for(int i=1;i<=m;i++)
            ans=ans*(n-i+1)/i;
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


