 class Solution {
    public int XXX(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int countTarget = -1;
        for (int e : nums) {
            list.add(e);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==target){
                countTarget=i;
                break;
            }
        }
        if(countTarget==-1){
            list.add(target);
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)==target){
                    countTarget=i;
                    break;
                }
            }
        }
        return countTarget;
    }
}

