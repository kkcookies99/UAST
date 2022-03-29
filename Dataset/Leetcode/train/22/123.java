 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        generate(res,"",n,n);
        return res;
    }
    
    public void generate(List<String> res, String subString, int leftnum, int rightnum){
        if(leftnum == 0 && rightnum == 0){
            res.add(subString);
            return;
        }
        
        if(leftnum >= 0 ){
            generate(res,subString+"(",leftnum-1,rightnum);
        }
        if(leftnum < rightnum){
            generate(res,subString+")",leftnum,rightnum-1);
            
        }
    }
}

