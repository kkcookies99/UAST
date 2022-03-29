class Solution {
public:
    void XXX(vector<int>& nums) {
        if(nums.size() <= 3) {
            sort(nums.begin(), nums.end());
            return;
        }
        int n = nums.size();
        // 把中轴点1放到末尾
        int left = 0, right = n - 1;
        if(nums[right] != 1){
            int head = 0, tail = n - 1;
            while(head < tail){
                if(nums[head] == 1){
                    swap(nums, head, n - 1);
                    break;
                }else if(nums[tail] == 1){
                    swap(nums, tail, n - 1);
                    break;
                }else{
                    head ++;
                    tail --;
                }
            }
        }
        // 快排的partition
        int less = left - 1, more = right;
        while(left < more){
            if(nums[left] < nums[right]){
                swap(nums, ++less, left++);
            }else if(nums[left] > nums[right]){
                swap(nums, --more, left);
            }else
                left ++;
        }
        swap(nums, more, right);
    }

    void swap(vector<int>& nums, int i, int j) {
        if(i != j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


