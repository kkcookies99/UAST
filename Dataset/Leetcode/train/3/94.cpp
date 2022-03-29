 class Solution {
public:
     int XXX(string s){
        int end = 0;int start =0;int maxnum = 0;
        while(end<s.length()){
            char temp = s[end];
            for(int index=start;index<end;index++){
                if(s[index]==temp){
                    start = index+1;
                    break;
                    }
            }
            end++;
            int len = end-start;
            maxnum = (maxnum>len?maxnum:len);
        }
        return maxnum;
    }
};

