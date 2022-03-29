 class Solution {
public:
    int XXX(string s) {
        int char_map[256] = {0};
        int length = s.length();
        int max = 0;
        char temp;
        for (int i = 0, j = 0; j < length; j++){
            temp = s.at(j);
            
            if (char_map[temp] > i){
                i = char_map[temp];
            }
            char_map[temp] = j + 1;
            if (j - i + 1 > max)
                max = j - i + 1;
        }
        return max;
    }
};

