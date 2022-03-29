 class Solution {
public:
    int findSame(string&s,char _s,int lo,int hi){
        int nosame = lo -1;
        while(lo<=hi){
            if(s[lo] == _s) return lo;
            lo++;
        }
        return nosame;
    }
    int XXX(string s) {
        int n = s.size();
        if(n <2) return n;
        int p1 = 0;
        int p2 = 1;
        int maxNum  = 0;
        int num = 1;
        while(p2<n){
            int ROS = findSame(s,s[p2],p1,p2-1);
            if(ROS<p1){
                p2++;
                num++;
            }
            else{
                if(num>maxNum) 
                maxNum = num;
                p1 = ROS+1;
                num = p2-p1+1;
                p2++;
            }
        }
        if(num>maxNum) maxNum = num;
        return maxNum;
    }
};

