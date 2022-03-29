 class Solution {
public:
    int divide(string s){
        int edge = s.size()-1;
        while(edge>=0){
            if(s[edge]!=' ') break;
            edge--;
        }
        return edge;
    }

    
    int XXX(string s) {
        int edge = divide(s);
        int num = 0;
        for(int i = 0;i<=edge;i++){
            if(s[i] ==' ')  num = 0;
            else num++;
        }
        return num;

    }
};

