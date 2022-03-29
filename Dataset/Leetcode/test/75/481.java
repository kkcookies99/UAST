  public void XXX(int[] nums) {
       int one =0;
        int zero=0;
        int two=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            }else {
                two++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zero > 0) {
                nums[i]=0;
                zero--;
            } else if (one > 0) {
                nums[i]=1;
                one--;
            } else {
                nums[i]=2;
            }
        }
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


