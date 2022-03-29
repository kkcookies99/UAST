class Solution {
public:
    vector<int> XXX(vector<int>& digits) 
    {
        Recursion(digits,digits.size()-1,1);
        return digits;

    }
    void Recursion(vector<int>& Digits,int Position,int Plus)
    {
        int Remain=(Digits[Position]+Plus)/10;
        Digits[Position]=((Digits[Position]+Plus)%10);

        if(Position==0&&Remain>0)
        {
            Digits.push_back(0);
            for(int i=Digits.size()-2;i>-1;i--)
            {
                Digits[i+1]=Digits[i];
            }
             Digits[0]=Remain;
             return;
        }
        else if(Remain>0)
        {
            Recursion(Digits,Position-1,Remain);
        }

    }


};

