public void XXX(int[] nums) {
         int zero = 0;
        int one = 0;
        int two = 0;


        for(int num :nums){
            if(num == 0) zero++;
            if(num == 1) one++;
            if(num == 2) two++;
        }
        int ii=0;
        while(ii<zero){
            nums[ii]=0;
            ii++;
        }

        while(ii<zero+one){
            nums[ii]=1;
            ii++;
        }

        while(ii<zero+one+two){
            nums[ii]=2;
            ii++;
        }


    }

