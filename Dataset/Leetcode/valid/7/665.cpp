 class Solution {
public:
    int XXX(int x) {
        string s=to_string(x);
        int left=0,right=s.length()-1;
        if(left==right){
          return stoi(s);  
        }
        while(left<right){
            char t;
            t=s[left];
            s[left]=s[right];
            s[right]=t;
            left++;
            right--;
        }
        if(x<0){
            return ~stoi(s)+1;    
        }
        return stoi(s);
    }
};

