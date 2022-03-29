 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1) return s;
        int lens = s.size();
        int index = 0;
        int row = 0;
        char ans[lens+1];
        ans[0] = s[0];
        bool flag = true;
        for(int i = 1;i < lens;++i){
            // ans[i] = s[index];
            if(row == 0 || numRows-row-1 == 0){
                if(row == 0){
                    index += 2*(numRows-row-1);
                }else{
                    index += 2*row;
                }
            }
            else {
                if(flag){
                        index += 2*(numRows-row-1);
                        flag = false;
                }else{

                        index += 2*row;
                        flag = true;
                }
                
            }
            if(index >= lens){
                // ++row;
                index = ++row;
                flag = true;
            }
            ans[i] = s[index];
            // printf("%d %c", index, s[index]);
        } 
        ans[lens] = '\0';
        // for(auto x:ans)cout<<x;
        return ans;
    }
};

