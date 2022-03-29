class Solution {
public:
    int XXX(int n) {
        int res[101]={-1};
        res[0]=1;
        res[1]=1;
        res[2]=2;
        for(int i=3;i<=n;++i){
            res[i]=(res[i-1]+res[i-2]);
        }
        return res[n];
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


