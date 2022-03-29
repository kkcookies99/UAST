 class Solution {
public:
    int XXX(int x) {
        auto ans=0;
        while(x!=0){
            if(ans<INT_MIN/10||ans>INT_MAX/10){
                return 0;
            }
            auto a=x%10;
            ans=ans*10+a;
            x=x/10;
        }
            
            if(x>=0){
                return ans;
            }
            else{

                return (-1*ans);
            }
        }


    };

