 public int singleNumber(int[] nums) {
        int n = nums.length;
        int[] oneCountPerBit = new int[32];//用来记录每一位出现1的个数
        for(int i = 0;i < n;i++){
            for(int j = 0;j < 32;j++){
                oneCountPerBit[j] += ((nums[i] >> j) & 1);//判断当nums[i]确定时，该数的第j位是否为1，若是，该位的oneCountPerBit加1
            }
        }
        //若某位上的结果无法被n(此处为2)整除，则肯定目标数字在这一位上
        int appearOnce = 0;
        for(int i = 0;i < 32;i++){
            if((oneCountPerBit[i] % 2) != 0){
                appearOnce += (1 << i);
            }
        }
        return appearOnce;
    }

