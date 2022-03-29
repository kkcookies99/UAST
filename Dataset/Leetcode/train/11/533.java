 class Solution {
    public int XXX(int[] height) {
        int XXX = 0;
        HashMap<Integer,Integer> map = new HashMap<>(height.length);
        for(int i=0;i<height.length;i++){
            if(!map.isEmpty()){
                XXX = Math.max(XXX, calMaxArea(map, i, height[i]));
            }
            map.put(i, height[i]);
        }
        return XXX;
    }
    private  int calMaxArea(Map<Integer,Integer> map,int x,int y){
        int XXX=0;
        for(Integer x1:map.keySet()){
            int currentArea = Math.abs(x-x1)*Math.min(y, map.get(x1));
            XXX = Math.max(XXX, currentArea);
        }
        return XXX;
    }
    
}

