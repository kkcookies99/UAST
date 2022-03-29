class Solution {
public:
    int XXX(int x) {
        for(int i=1;i<INT_MAX-1;i++){
            unsigned long long tmp = (unsigned long long)i*(unsigned long long)i;
            if(tmp>(unsigned long long)x){
                return i-1;
            }
        }
        return 0;
    }
};

