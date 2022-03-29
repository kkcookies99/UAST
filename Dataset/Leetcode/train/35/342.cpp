 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        //左中右三个指针
        int left=0, right=nums.size()-1, mid=(left+right)/2;
        //三种情况：
        //1、当中指针和 左指针 或者 右指针 重合，说明已经遍历完数组：
        //      如果目标值大于右指针，中指针等于右指针加一
        //      如果目标值大于左指针，中指针等于左指针加一
        //3、当目标值大于中指针所在值，左指针移至中指针右边（mid + 1）
        //4、当目标值小于中指针所在值，右指针移至中指针左边（mid - 1）
        while (target != nums[mid]){
            if (mid == right || mid == left){
                if (nums[right] < target)
                    mid = right + 1;
                else if (nums[left] < target)
                    mid = left + 1;
                break;
            }
            else if (target > nums[mid]){
                left = mid + 1;
                mid = (left+right)/2; 
            }
            else if (target < nums[mid]){
                right = mid - 1;
                mid = (left+right)/2;
            }
        }
        
        return mid;
    }
};

