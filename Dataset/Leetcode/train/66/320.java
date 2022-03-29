 public int[] XXX(int[] digits) {
        Stack<Integer>stack=new Stack<>();
        int end=digits.length-1;
        int carry=1,i;
        for(i=end;i>=0&&carry==1;i--){
            int value=digits[i]+1;
            if(value<10) {
                stack.push(value);
                carry=0;//不用再计算
            }
            else{
                stack.push(0);
            }
        }
        while(i>=0)  {
            stack.push(digits[i]);
            i--;
        }
        if(carry==1) stack.push(1);
        int[]newDigit=new int[stack.size()];
        int j=0;
        while(!stack.isEmpty()){
            newDigit[j]=stack.pop();
            j++;
        }
        return newDigit;

    }

//分两种情况，若全是9，则需要新建数组（100...00）,否则原地更改那些有进位的
 public int[] XXX(int[] digits) {
        int n=digits.length,i=n-1;
        boolean changeLen=true;
        while(i>=0&&digits[i]==9) i--;
        if(i==-1){//开头增加一个1，后面全是0
           int[]newDig=new int[n+1];
           newDig[0]=1;
           return newDig;
        }
        else{//原地更改，只更改需要进位的位置
           int carry=1,value;
           for(int j=n-1;j>=0&&carry==1;j--){
            if(digits[j]==9){
              digits[j]=0;
            }
            else{
                digits[j]++;
                carry=0;//结束了,前面的不用动
            }
           }
           return digits;
        } 

    }

