class Solution {
public:
    int XXX(string s) {
        int i = 0;
        long long num = 0;
        int flag = 0;
        while( s[i]==' ' ) ++i;
        if( s[i]=='+' ){
            flag = 0;
            i++;
        }
        else if( s[i]=='-' ){
            flag = -1;
            i++;
        }
        else if( !(s[i] >= '0' && s[i] <='9' ))
            goto exit;
        for( ; i<s.size(); ++i )
        {
            if( s[i]>='0' && s[i]<='9' ){ 
                if( num < 214748365 ){ 
                    if( num != 214748364 ){
                        num *= 10;
                        num += int(s[i]-48);
                    }
                    else
                    {
                        if( flag == -1 ){
                            if(s[i] > '8' && s[i]  <= '9' )
                            {
                                num = 2147483648;
                                break;
                            }
                            else
                            {
                                num *= 10;
                                num += int(s[i]-48);
                            }
                        }
                        else
                        {
                            if( s[i] >= '8' && s[i]  <= '9' )
                            {
                                num = 2147483647;
                                break;
                            }
                            else
                            {
                                num *= 10;
                                num += int(s[i]-48);
                            }
                        }
                    }
                }
                else
                {
                    if( flag == -1){
                        num = 0x80000000;
                        break;
                    }
                    else{
                        num = 0x80000000-1;
                        break;
                    }
                }
            }
            else
                break;
        }
exit:
        cout << flag ;
        return flag == -1 ? -num : num ;
    }
};

