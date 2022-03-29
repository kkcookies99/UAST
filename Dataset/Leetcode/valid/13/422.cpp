 class Solution {
public:
    int XXX(string s) {
        char arr[7]={'M','D','C','L','X','V','I'};
        int a[7]={1000,500,100,50,10,5,1},num=0;
        vector<int> number;
        int l=s.size();
        for(int i=0;i<l;i++){
            for(int j=0;j<7;j++){
                if(s[i]==arr[j])
                    number.push_back(j);
            }
        }
        for(int i=0;i<l-1;i++){
            if(number[i+1]<number[i])
                num-=a[number[i]];
            else    num+=a[number[i]];
        }
        num+=a[number[l-1]];
        return num;
    }
};

