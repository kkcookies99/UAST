 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ret;
        ret.push_back({});//放空集
        int size=nums.size();//原数组大小
        int subsize=pow(2,size);//返回数组大小2**size
        int hash=1;//计次和判断
        while(hash<subsize){
            vector<int> temp;//当前插入单元
            for(int k=0;k<size;k++) {//遍历数组
                int a=1<<k;//a=2**k
                if(hash&a) {//a的二进制是1k个0，以a来读取hash中1的位次和数量
             temp.push_back(nums[k]);//以hash二进制码1的位次来映射源数组的元素，将之添加进temp
                }
            }
            ret.push_back(temp);//.每次都会加一个合理单元进数组
            hash++;
        }
        return ret;
    }
		

