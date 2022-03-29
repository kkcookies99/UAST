class Solution {
public:
    int myPower(int i, int k=10){
        int ans=1;
        while(i>0){
            ans *= k;
            i--;
        }
        return ans;
    }
    int countNumber(int x){
        int i = 0;
        while(x != 0){
            i++;
            x /= 10;
        }
        return i;
    }
    int XXX(int x) {
        if(x == 0) return 0;
        int ans = -1;
        int num = countNumber(x);
        int k = (num + 1) / 2;
        int left = myPower(k-1), right = myPower(k), mid = 0;
        long square = 0;
        printf("num=%d, k=%d\n", num, k);
        while(left <= right){
            mid = (left + right) / 2;
            square = (long)mid * mid;
            // printf("left=%d, right=%d\n", left, right);
            if(square == x){
                ans = mid;
                break;
            }else if(square > x){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        ans = ans == -1 ? right : ans;
        return ans;
    }
};

