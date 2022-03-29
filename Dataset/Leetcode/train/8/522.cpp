 class Solution {
public:
    int is_num(char z)//判断并转数字，如果不是数字返回-1
    {
        int num = z-'0';
        if(num>=0&&num<=9)
        {
            return num;
        }
        else if(z==' ')
        {
            return -2;
        }
        else if(z=='-')
        {
            return -3;
        }
        else if(z=='+')
        {
            return -4;
        }
        return -1;
    }
    int XXX(string s) {
        long read=0;
        int i = 0;
        int marker = 1;//1表示为负数
        bool rr = false;//表示是否已经读数了
        while(i<s.size()){
            char tmp_char = s.c_str()[i];
            int tmp_i = is_num(tmp_char);
            if(tmp_i==-1)
            {
                // return rr?read*marker:0;
                if(rr)break;
                else return 0;
            }
            else if(tmp_i == -2)//是空格
            {
                if(rr) break;
                else i++;
            }
            else if(tmp_i<-2)//+-
            {
                i++;
                if(rr)break;
                int nxt = is_num(s.c_str()[i]);
                if(nxt < 0 )
                {
                    return 0;
                }
                else
                {
                    marker = tmp_i==-3?-1:1;
                }
            }
            else{//read in number
                rr = true;
                i++;
                if(read<INT_MAX&&read>INT_MIN)
                    read = read*10+tmp_i;
                else
                    break;
            }
        }
        read*=marker;
        return max(min(long(INT_MAX),read),long(INT_MIN));
    }
};

