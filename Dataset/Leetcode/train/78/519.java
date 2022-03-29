 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 位运算法
        /*
        首先要知道：一个集合有n个元素，那么该集合有2^n个子集
        那么我们可以用一个n位的二进制数来表示各个子集的状态
        例如：集合{A,B,C}，可用一个三位二进制数来表示
            000 --> 空集
            001 --> {A}
            010 --> {B}
            100 --> {C}
            011 --> {A,B}
            101 --> {A,C}
            110 --> {B,C}
            111 --> {A,B,C}
        从以上可以看出，可以用2^i表示集合中某个特定的元素，如2^0表示A，2^1表示B，2^3表示C
        那么当某个子集中包含元素A时，二进制数的第0位(最后一位)一定是1，
        同理，包含B则第1位是1，包含C则第2位是1，
        因此我们可以遍历各个元素来生成相应的子集
        那么代码如下：
        */
        int setNum = 1 << nums.length; //表示子集的个数
        // i从0到setNum，表示所有子集的种类
        for(int i=0;i<setNum;i++){
            List<Integer> cur = new ArrayList<>();
            
            for(int j=0;j<nums.length;j++){
                /*
                1<<j 表示集合中第j个元素
                i & (1<<j)为true是表示该集合的一个子集
                */
                if((i & (1<<j)) != 0 ){
                    cur.add(nums[j]);
                }
            }
            res.add(cur);
        }
        return res;
    }

