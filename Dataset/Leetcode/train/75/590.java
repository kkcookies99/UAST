 public void XXX(int[] nums) {
        int element=0;//元素（0，1，2）
        int temp;
        int index=0;
        while(element<3)
        {
           while(nums[index]==element)//从第一个与位置不匹配的数开始
           {
               if(index==nums.length-1)
                   break;
               index++;
           }
            for(int j=index+1;j<nums.length;j++)//从这个数往后扫描，遇到正确元素，调换位置
            {
                if(nums[j]==element)
                {
                    temp=nums[index];
                    nums[index]=nums[j];
                    nums[j]=temp;
                    index++;//调换后，索引+1，此时这个数仍旧不是正确
                }
            }
            element++；//一次扫描完成后，该元素的位置已经正确，排列下一个元素
        }
    }

