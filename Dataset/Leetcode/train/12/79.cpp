 class Solution {
public:
    map<int,string>mp;
    string XXX(int num) {
        mp[1] = "I";mp[4] = "IV";mp[5] = "V";mp[9] = "IX";mp[10] = "X";mp[40] = "XL";
        mp[50] = "L";mp[90] = "XC";mp[100] = "C";mp[400] = "CD";mp[500] = "D";mp[900] = "CM";
        mp[1000] = "M";
        vector<int>refer_table;
        refer_table.push_back(1);refer_table.push_back(4);refer_table.push_back(5);
        refer_table.push_back(9);refer_table.push_back(10);refer_table.push_back(40);
        refer_table.push_back(50);refer_table.push_back(90);refer_table.push_back(100);
        refer_table.push_back(400);refer_table.push_back(500);refer_table.push_back(900);
        refer_table.push_back(1000);
        string s = "";
        while(num!=0){
            int pos = upper_bound(refer_table.begin(),refer_table.end(),num)-refer_table.begin();
            int n = num/refer_table[pos-1];
            for(int i = 0;i<n;i++)s+=mp[refer_table[pos-1]];
            num%=refer_table[pos-1];
        }
        return s;
    }
};

