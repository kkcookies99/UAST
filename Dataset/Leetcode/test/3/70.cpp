 class Solution {
public:
    int XXX(string s) {
        if (s.size()==0)
        {
            return 0;
        }
        int m=0,size_c=0;
        map<char,int> c_i;
        int start_pose=0;
        c_i[s[0]]=0;
        size_c=1;
        for(int i=1;i<s.size();i++)
        {
            if(c_i.find(s[i])==c_i.end())
            {
                c_i[s[i]]=i;
                size_c++;
               
            }
            else
            {
                int n=c_i[s[i]];
                if (n>=start_pose)
                {
                    
                    m=max(m,size_c);
                    size_c=size_c-(n-start_pose);
                    start_pose=n+1;

                }
                else
                {
                size_c++;   
                }
                c_i[s[i]]=i;
            }

           
        }
    m=max(m,size_c);
    return m;
    }
};

