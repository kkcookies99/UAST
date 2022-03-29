class Solution {
public:
    
    string XXX(int n) 
    {
        vector<string> mp(35);
        mp[1]="1";
        mp[2]="11";
        mp[3]="21";
        mp[4]="1211";
        mp[5]="111221";
        for(int i=6;i<31;i++)
        {
            string h="";
            char temp=mp[i-1][0];
            int num=1;
            for(int j=0;j<mp[i-1].size()-1;j++)
            {
                if(temp==mp[i-1][j+1])
                {
                    num++;
                }
                else
                {
                    h+=to_string(num)+temp;
                    num=1;
                    temp=mp[i-1][j+1];
                }
            }
            h+=to_string(num)+temp;
            mp[i]=h;
        }
        return mp[n];
    }
};

