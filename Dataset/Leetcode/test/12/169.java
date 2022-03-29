 class Solution {
    public String XXX(int num) {
        Stack<String> stack=new Stack<String>();
        StringBuffer sb=new StringBuffer();
        int weight=10;
        String [] arr={"I","V","X","L","C","D","M"};
        int i=0;
        while(num>0){
           int remain=num%weight;
           if(remain>0&&remain<4){
               stack.push(String.join("",Collections.nCopies(remain,arr[i*2])));
           }else if(remain==4){
               stack.push(arr[i*2]+arr[i*2+1]);
           }
           else if(remain==5){
               stack.push(arr[i*2+1]);
           }else if(remain>5&&remain<9){
                stack.push(arr[i*2+1]+String.join("",Collections.nCopies(remain-5,arr[i*2])));
           }else if(remain==9){
               stack.push(arr[i*2]+arr[i*2+2]);
           }
           i++;
           num=num/10;   
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();

    }
}

