 class Solution {
    public String XXX(int num) {
        String[] w1 = {"0", "I", "X", "C", "M"};
        String[] w5 = {"0", "V", "L", "D"};
        Deque<Integer> numStack = new LinkedList<>();
        int size = 0;
        StringBuffer res = new StringBuffer();
        while(num != 0){
            numStack.push(num%10);
            num /= 10;
            size++;
        }
        
        for(int i = size; i >= 1; i--){
            int nm = numStack.pop();
            int x = nm % 5;
            switch(x){
                case 0:
                    if(nm == 5) res.append(w5[i]);
                    break;
                case 1:
                    if(nm < 5) res.append(w1[i]);
                    else res.append(w5[i] + w1[i]);
                    break;
                case 2:
                    if(nm < 5) res.append(w1[i] + w1[i]);
                    else res.append(w5[i] + w1[i] + w1[i]);
                    break;
                case 3:
                    if(nm < 5) res.append(w1[i] + w1[i] + w1[i]);
                    else res.append(w5[i] + w1[i] + w1[i] + w1[i]);
                    break;
                case 4:
                    if(nm < 5) res.append(w1[i] + w5[i]);
                    else res.append(w1[i] + w1[i+1]);
                    break;
            }
        }
        return res.toString();
    }
}

