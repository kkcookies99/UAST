 class Solution {
public:
    int XXX(string s) {
        int len=s.size()-1;  //求高人指点，这里为啥是需要减去1，难道是\0的原因？
        int L=0;
        int R=-1;
        int res=0;
        map<char,int>map;
        while(R<len){
            R++;
            map[s[R]]++;
            if(map[s[R]]==1){
                res=max(res,R-L+1);
            }
            while(map[s[R]]>1){
                //res=max(res,R-L+1);
                map[s[L]]--; 
                L++;               
            }
        }
        return res;        
    }
};

