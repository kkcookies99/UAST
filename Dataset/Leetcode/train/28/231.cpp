 class Solution {
public:
    int XXX(string haystack, string needle) {
        //bool flag=false;
        int cnt=-1;
        if(needle==""){return 0;}
        //else if(haystack==""){return -1;}
        else
        {
            int len=needle.length();
            for(int i=0;i<haystack.size();i++)
            {
                if(needle==haystack.substr(i,len))
                {
                   // flag=true;
                    cnt=i;
                    break;
                }


            }
        }
        return cnt;

    }
};

