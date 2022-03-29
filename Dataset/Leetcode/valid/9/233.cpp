class Solution {
public:
    bool XXX(int x) {
        if(x<0)
        {
            return false;
        }
        if(x>=0&&x<10)
        {
            return true;
        }
        if(x>=10)
        {
            vector<int> str_int;
            while(x!=0)
            {
                str_int.push_back(x%10);
                x=x/10;
            }
            int len_str=str_int.size();
            for(int i=0;i<(len_str/2);i++)
            {
                if((str_int[i])!=(str_int[len_str-i-1]))
                {
                    return false;
                }
                else
                {
                    if(i==(len_str/2-1))
                    {
                        return true;
                    }
                }
            }
        }
    //return true;
    }
};

