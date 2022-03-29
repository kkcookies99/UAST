class Solution {
public:
    int XXX(int n) {
        if(n==1) return 1;
        if(n<=3) return n;
        int pre = 1,cur = 1;
        int next;
        for(int i=2;i<=n;++i) {
            next = pre + cur;
            //next=2, pre= 1,cur  = 1
            pre = cur;
            cur = next;//cur == 2
        }
        return cur;
        
        //return XXX(n-1) + XXX(n-2);
    }
};



