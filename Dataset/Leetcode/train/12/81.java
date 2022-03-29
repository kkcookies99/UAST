 class Solution {
    public String XXX(int num) {
        int[]values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[]strs={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder build=new StringBuilder();
        for(int i=0;i<13&&num>0;i++){
            while(values[i]<=num){
                build.append(strs[i]);
                num-=values[i];
            }
        }
        return build.toString();
    }
}

