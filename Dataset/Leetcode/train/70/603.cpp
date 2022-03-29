class Solution {
public:
    int XXX(int n) {
        int arr[3]={1,2,3};
        if(n<=3) return arr[n-1];
        for(int i=3;i<n;i++)
        {
            arr[0]=arr[1];
            arr[1]=arr[2];
            arr[2]=arr[0]+arr[1];
        }
        return arr[2];
    }
};

