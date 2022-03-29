 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<numRows+1;i++){
            if(i==0){
                continue;
            }
            List<Integer> ele = new ArrayList<>();
            if(i==1){
               ele.add(1);
               result.add(ele);
               continue;
            }
            List<Integer> uploca = result.get(result.size()-1);
            List<Integer> locaele = desplay(i,uploca);
            result.add(locaele);
        }
        return result;
    }

    public List<Integer> desplay(int localength,List<Integer> uploca){
        List<Integer> locaArray = new ArrayList<>();
        if(uploca.size()==1){
            for(int i=0;i<localength;i++){
                locaArray.add(1);
            }
            return locaArray;
        }
        for(int i=0;i<localength;i++){
            if(i==0||i==localength-1){
                locaArray.add(1);
            }else{
                int step = uploca.get(i-1)+uploca.get(i);
                locaArray.add(step);
            }
        }
        return locaArray;
    }   
}

