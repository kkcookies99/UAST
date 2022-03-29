     public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();

        if(nums == null || nums.length < 3){
            return resList;
        }

        int len = nums.length;

        Arrays.sort(nums);

        // 用来获取第三个数，第三个数必然是前两个数之和的相反数
        // 由于只用把这个数从map中取出即可，所以有多个重复数时，取的是索引最大的那个数，不影响
        Map<Integer,Integer> map = new HashMap<>(); 
        for(int i = 0;i < len;i++){ // 记录每个数字的索引。重复数字保留大的索引
            map.put(nums[i],i);
        }

        if(nums[0] > 0){ // 数组是排好序的，如果第一个就大于0的 ，那三个数之和肯定不会等于0
            return resList;
        }

        for(int i = 0;i < len - 2;i++){ // 第一个数
            // 不能与上一次循环遍历的数一样
            // 因为假如上一次遍历到的数 符合要求，倘若这次还是一样的数，有可能形成重复的三元组
            // 举例：已经有[a,b,c]符合要求，如果这次遍历到的第一个数还是a，那么b依旧会是第二个数的选择，从而c就是第三个数
            if(i > 0 && nums[i] == nums[i -1]){ 
                continue;
            }
            
            for(int j = i + 1;j < len - 1;j++){ // 第二个数
                // 已经有[a,b,c]符合要求，在第一个数是a的前提下，如果这次遍历到的第二个数还是b，那么c就是第三个数
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }

                Integer k = map.get(-(nums[i] + nums[j])); // 前两个数之和
                // 第三个数必须在第二个数后面，才能保证不重复
                // 也就是不能往回找
                // 我们枚举的三元组(a,b,c)满足a≤b≤c，保证了只有(a,b,c)这个顺序会被枚举到，而(b,a,c)、(c,b,a) 等等这些不会
                // 对于[-4,-1,-1,0,1,2]来说
                // 重复的情况：[[-1,-1,2],[-1,0,1],[-1,1,0],[0,1,-1]]
                if(k != null && k > j){ 
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    resList.add(temp);
                }else if(k != null && k <= j){ // 这一步是可取的，因为数组已经排好序了, 对于当前的第二个数来说，第三个数小于它，
                     break;                    // 继续循环遍历，第二个数只会更大,那第三个数就更小于第二个数了
                }
            }
        }
        return resList;
    }
}

