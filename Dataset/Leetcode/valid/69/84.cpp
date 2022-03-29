class Solution {
public:
    int XXX(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        long i=2;
        long sum = 0;
        while(sum<=x)
        {
            sum=i*i;
            i++;
        }
        return i-2;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


