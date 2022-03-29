class Solution {
public:
    int XXX(string s) 
    {
        string roma1 = "MDCLXVI";
        int num_basic[7] = {1000,500,100,50,10,5,1};
        int num = 0;
        int len = s.length();
        for(int i = 0; i < len; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                if(s[i] == roma1[j] )
                {
                    num += num_basic[j];
                    cout << num << endl;
                    if ( i > 0)
                    {
                        if ((s[i] == roma1[0] || s[i] == roma1[1]) && s[i-1] == roma1[2])
                        {
                            num -= 200;
                        }
                        else if ((s[i] == roma1[2] || s[i] == roma1[3]) && s[i-1] == roma1[4])
                        {
                            num -= 20;
                        }
                        else if ((s[i] == roma1[4] || s[i] == roma1[5]) && s[i-1] == roma1[6])
                        {
                            num -= 2;
                        }
                    }
                }
            }
        }
        return num;
    }
};

