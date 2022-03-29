class Solution {
public:
    int XXX(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        int n1 = 1, n2 = 2;

        for(int i=3;i<=n;i++){
            int temp = n1+n2;
            n1 = n2;
            n2 = temp;
        }

        return n2;
    }
};