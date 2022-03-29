 class Solution {
    public String XXX(int num) {
        int[] key={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] value={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int temp=num;
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(temp!=0){
            if(temp>=key[i]){
                sb.append(value[i]);
                temp-=key[i];
            }
            if(temp<key[i]){
                i++;
            }
        }    
        return sb.toString();
    }
}

