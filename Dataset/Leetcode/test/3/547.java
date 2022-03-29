 class Solution {
    public int XXX(String s) {
        char []arr=s.toCharArray();
        HashSet set=new HashSet();
        int a=0,b=0,res=0,sum=0;
        while(b<arr.length){
            if(set.add(arr[b])){
                res=++b-a;
            }else{
                set.remove(arr[a++]);
            }
            sum=Math.max(sum,res);
        }
        return sum;
    }
}
