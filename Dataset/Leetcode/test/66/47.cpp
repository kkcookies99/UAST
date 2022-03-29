 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int m, cnt = 0, flag = 0;
        m = digits.back();
        
        if(m == 9){
            while(m == 9){
                digits.pop_back();
                cnt++;
                if( digits.empty()){
                    flag  = 1;
                    break;
                }
                m = digits.back();
            }
            if(flag == 1){
                digits.push_back(1);
                for(int i = 0; i < cnt; i++){
                    digits.push_back(0);
                }
            }
            else{
                digits.pop_back();
                m++;
                digits.push_back(m);
                for(int i = 0; i < cnt; i++){
                    digits.push_back(0);
                }
            }

            return digits;
        }

        m++;
        digits.pop_back();
        digits.push_back(m);
        
        return digits;
    }
};

