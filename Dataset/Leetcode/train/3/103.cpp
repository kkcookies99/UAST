 class Solution {
public:
    int XXX(string s) {
        int  res =0;
        int max =0;
        if(s.size()<=1)
        {
            return s.size();
        }
        int head=0,tail=1;
        for(int i=1;i<s.size();i++)
        {
            tail =i;
            for(int j=head;j<tail;j++)
            {
                if(s[tail]==s[j])
                head =j+1;
            }
            max = tail-head+1;
            if(max>res)
                res=max;
        }
        return res;
    }
};

