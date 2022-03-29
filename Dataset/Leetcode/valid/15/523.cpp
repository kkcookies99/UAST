 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& arr) {
        
        vector<vector<int>> res;
        sort(arr.begin(),arr.end());
        for(int i=0;i<(int)arr.size()-2&&arr[i]<=0;++i){
            //这次遍历下来的结果一定是上一次遍历结果的子集，所以要去重并且时间上有一个优化。
            //因为相对于上次遍历来讲，i不变，但是少了一个元素，就是现在i指向的元素。
            //也就是说上次我的i固定住了，然后在上次的i+1和size-1之间考虑有没有数字使得三数相加为0
            //对于这次来讲，可以看作为i没有动，但是在i+2到size-1之间考虑有没有数字使得三数相加为0
            //显然这次遍历的结果一定是上次遍历结果的子集  
            if(i>0 && arr[i]==arr[i-1])
                continue;
            int j=i+1,k=arr.size()-1,serched=0-arr[i];
            while(j<k){
                if(arr[j]+arr[k]>serched){
                    --k;
                    while(j<k&&arr[k]==arr[k+1])
                        --k;
                }else if(arr[j]+arr[k]<serched){
                    ++j;
                    while(j<k&&arr[j]==arr[j-1])
                        ++j;
                }else{
                    res.emplace_back(vector<int>{arr[i],arr[j],arr[k]});
                    //避免重复
                    ++j;
                    while(j<k&&arr[j]==arr[j-1])
                        ++j;
                    --k;
                    while(j<k&&arr[k]==arr[k+1])
                        --k;
                }
            }
        }
        
        return res;

        
    }
};

