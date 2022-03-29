 class Solution {
public:
    string XXX(string a, string b) {
        string max = a.size()>b.size() ? a : b;
        string min;
        if(max==a)
            min=b;
        else
            min=a; 
        string result;
        int i=0;
        int maxSize = max.size();
        int minSize = min.size();
        while(i<maxSize-minSize)//将短字符串前补0，使两字符串长度相等
        {
            min='0'+min;
            i++;
        }
        int j=max.size()-1;
        while(j>=0)//'c'位进位标志，代表该位要要加1（因为后面进位了）
        {
            if(max[j]=='0' && min[j]=='0')
                {
                    if(result[0]!='c')
                        result='0'+result;
                    else
                        result[0]='1';
                }
            else if(max[j]=='1' && min[j]=='0'|| max[j]=='0' && min[j]=='1')
                {   
                    if(result[0]!='c')
                        result='1'+result;
                    else
                    {
                        result[0]='0';
                        result='c'+result;
                    }
                }
            else
            {   if(result[0]!='c')
                {
                    result='0'+result;
                    result='c'+result;
                }
                else
                {
                    result[0]='1';
                    result='c'+result;
                }
            }
            j--;
        }
        /*判断加完后，首位是否有进位标志，如果没有直接返回，如果有进位标志，就将    进        位标志'c'改为'1'*/
        if(result[0]!='c')
            return result;

        result[0]='1';
        return result;   
    }
};

