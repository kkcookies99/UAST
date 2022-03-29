 class Solution {
public:
    string XXX(string s) {
        int len=s.size();
        int left=0,right=0;
        for(int i=0;i<len-1;++i)
        {
            int left1=i,right1=i;
            int left2=i,right2=i+1;
            while(left1>=0&&right1<len&&s[left1]==s[right1])
            {
                left1--,right1++;
            }
            while(left2>=0&&right2<len&&s[left2]==s[right2])
            {
                left2--,right2++;
            }
            if(right1-left1-1>right-left+1)
            {
                left=left1+1,right=right1-1;
            }
            if(right2-left2-1>right-left+1)
            {
                left=left2+1,right=right2-1;
            }
        }
        return s.substr(left,right-left+1);
    }
};

