 int XXX(char * s){
    int i, j, k, sum;
    i = j = k = sum = 0;
    int* nums;
    while(s[k] != '\0'){//计算字符串长度
        ++j;
        ++k;
    }
    nums = (int*)malloc(j * sizeof(int));
    while(s[i] != '\0'){//遍历这个给的罗马数字用nums数组保存值
        switch(s[i]){
            case 'I':
                if(s[i+1] == 'V' || s[i+1] == 'X')nums[i]=-1;
                else nums[i] = 1;
                break;
            case 'V':
                nums[i] = 5;
                break;
            case 'X':
                if(s[i+1] == 'L' || s[i+1] == 'C')nums[i]=-10;
                else nums[i] = 10;
                break;
            case 'L': 
                nums[i] = 50;
                break;
            case 'C':
                if(s[i+1] == 'D' || s[i+1] == 'M')nums[i]=-100;
                else nums[i] = 100;
                break;
            case 'D':
                nums[i] = 500;
                break;
            case 'M':  
                nums[i] = 1000;
                break;              
        }//switch
        sum += nums[i];//计算数值
        ++i;
    }
    return sum;
}

