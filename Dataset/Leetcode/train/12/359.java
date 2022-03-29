 class Solution {
    public String XXX(int num) {
        String[] list={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] a={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String res ="";
        while(num!=0){
            for(int i=0;i<a.length;i++){
                if(a[i]<=num){
                    num =num -a[i];
                    res =res+list[i];
                    break;
                }
            }
        }
        return res;
    }
}

