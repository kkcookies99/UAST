 class Solution {
public:
    bool XXX(string s) {
        int pos1 = 0, pos2 = s.size() - 1; //双指针遍历
        while(pos1 < pos2){
            char front = s[pos1];
            char rear = s[pos2];
            int flag = 0;
            if(!isalnum(front)){
                pos1++;
                flag = 1;
            } 
            if(!isalnum(rear)){
                pos2--;
                flag = 1;
            } 
            
            if(flag) continue;
            if(front-rear==0 || tolower(front)-tolower(rear)==0){
                pos1++; pos2--;
            }else{
                return false;
            }   
        }
        return true;
    }
};

