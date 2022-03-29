class Solution {
public:
    int XXX(string s) {
        int result = 0;
        string temp;
        for (int i = 0; i < s.size(); i++)
        {
            if (s.at(i) == '+' && i != s.size() - 1)
            {
                if (s.at(i + 1) >= 48 && s.at(i + 1) <= 57)
                {
                    result = partial_processing(s, i, 0);
                    break;
                }
                else
                    break;
            }
            else if (s.at(i) >= 48 && s.at(i) <= 57)
            {                
                result = partial_processing(s, i, 0);
                break;
            }
            else if (s.at(i) == '-' && i != s.size() - 1)
            {
                if (s.at(i + 1) >= 48 && s.at(i + 1) <= 57)
                {                  
                    result = partial_processing(s, i, 1);
                    break;
                }
                else
                    break;
            }
            else if (s.at(i) == ' ')                          
                continue;
            else 
                break;
        }

        return result;
    }
    int partial_processing(string s,int begin,bool sign)
    {        
        //begin作为处理的起始位置，sign代表符号：0为正，1为负
        int zero_flag = 0, count = 0;;
        string temp;
        for (int i = begin; i < s.size(); i++)
            if ((s.at(i) == '+' || s.at(i) == '-')&&i==begin)
                continue;
            else if (s.at(i) >= 48 && s.at(i) <= 57)
            {
                count++;
                if (s.at(i) == '0')
                    zero_flag++;
                else
                    zero_flag--;

                if (zero_flag != count)
                    temp += s.at(i);
            }
            else
                break; 
        if (count == zero_flag)
            temp = "0";
        //cout << "temp:" << temp<<endl;
        return Atoi_to_int(temp, sign);
    }
    int Atoi_to_int(string temp, bool sign)
    {   
        if (temp.size() >= 11)       
            if (sign == 0)
                return int(2147483647);
            else
                return int(-2147483648);  
        long long int power = pow(10, temp.size() - 1);
        long long int result = 0;
        bool overflow = 0;
        for (int i = 0; i < temp.size(); i++)
        {
            result += (temp.at(i) - '0') * power;
            power /= 10;
            if (result >= 2147483647 && sign == 0)
            {
                overflow = 1;
                break;
            }
            if (result >= 2147483648 && sign == 1)
            {
                overflow = 1;
                break;
            }
        }

        if (sign == 0)
        {
            if (overflow == 1)return int(2147483647);
            else
                return int(result);
        }
        if (sign == 1)
        {
            if (overflow == 1)return int(-2147483648);
            else
                return int(-result);
        }
        return int(result);
    }
};

