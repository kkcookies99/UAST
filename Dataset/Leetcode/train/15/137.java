 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if (nums == null || nums.length <= 2) return new ArrayList<List<Integer>>();
        List<List<Integer>> llist = null;
        Set<List> set = new HashSet();
        List<Integer> list = null;
        int base = 0;
        int left = base + 1;
        int right = nums.length - 1;
        int temp;

        quicksort(nums, 0, nums.length - 1);

        while (base < nums.length) {
            int complement = 0 - nums[base];
            while (left < right) {
                if (complement == nums[left] + nums[right]) {
                	list = new ArrayList<Integer>();
                    list.add(nums[base]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                } 
                if (complement < nums[left] + nums[right]) right--;
                else left++;
            }
            while (base < nums.length && nums[base] + complement == 0) base++;
            left = base + 1;
            right = nums.length - 1;
        }
        llist = new ArrayList(set);
        return llist;
    }

    public void quicksort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotpos = partition(nums, low, high);
            quicksort(nums, low, pivotpos - 1);
            quicksort(nums, pivotpos + 1, high);
            
        }
    
    }

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        while (low < high) {
            while (low < high && pivot <= nums[high]) high--;
            nums[low] = nums[high];
            while (low < high && pivot >= nums[low]) low++;
            nums[high] = nums[low];
        }
        nums[low] = pivot;
        return low;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

