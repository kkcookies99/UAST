 class Solution {
public:
    int XXX(int m, int n) {
        if(m==1||n==1) return 1;
        vector<int> temp(m,1);
        for(int i=1;i<n;++i)
        {
           for(int j=m-1;j>=0;--j)//找规律，用一个m长的数组存储每一个位置出发有多少种方法，再迭代n，
           {
               temp[j]=accumulate(temp.begin(),temp.begin()+j+1,0);//找规律
           } 
        }

        return temp[m-1];
    }
};

