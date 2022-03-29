 class Solution {
public:
    int XXX(int m, int n) {
        int down=m-1;
        int all=m+n-2;
        long long res=1;
        for(long long i=1;i<=down;i++){
            res=res*(all-down+i)/i;
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


