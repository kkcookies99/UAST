  class Solution {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            public List<List<Integer>> XXX(int[] nums) {
                boolean[] visit= new boolean[nums.length];
                backstracking(nums,visit);
                return res;


            }

            private void backstracking(int[] nums,boolean[] visit) {
                if(list.size()==nums.length){
                    res.add(new ArrayList<>(list));
                }
                for(int i=0;i<visit.length;i++){
                    if(visit[i]==false){
                        visit[i]=true;
                        list.add(nums[i]);
                        backstracking(nums,visit);
                        //回溯操作
                        list.remove(list.size()-1);
                        visit[i]=false;
                    }
                }
            }
        }

