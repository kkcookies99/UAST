 class Solution {
public:
    int XXX(string s) {
        int length = s.length();
        if(length < 2){
            return length;
        }
        
        int left = 0, right = 1, max = 0;
        
        for(int i = 1; i < length; i++){
            
            char current = s[i];
            for(int j = left; j < right; j++){
                if(current == s[j]){
                    if(max < (right-left)){
                        max = right - left;
                    }
                    left = j + 1;
                    break;
                }
            }
            right++;
            
        }
        
        if(max < (right-left)){
            max = right-left;
        }
        return max;
        
    }
};

