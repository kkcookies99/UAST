class Solution {
public:
    int XXX(int x) {
        long long int ans = x;
        long long int square= 0;
        while(ans){
            long long int temp = ans/2;
            square= temp*temp;
            ans = temp;
            if(square<= x){
                break;
            }
        }
        while(square<= x){
            ans++;
            square= ans*ans;
        }
        return ans-1;
    }
};

