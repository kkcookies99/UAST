public int XXX(String s) {
        int result = 0;
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'M' : nums[i] = 1000; break;
                case 'D' : nums[i] = 500; break;
                case 'C' : nums[i] = 100; break;
                case 'L' : nums[i] = 50; break;
                case 'X' : nums[i] = 10; break;
                case 'V' : nums[i] = 5; break;
                case 'I' : nums[i] = 1; break;
                default:
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i==nums.length-1 || nums[i] >= nums[i + 1]) {
                result += nums[i];
            } else {
                result -= nums[i];
            }
        }
        return result;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

