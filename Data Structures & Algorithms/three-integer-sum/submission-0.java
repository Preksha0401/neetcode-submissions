class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        HashSet<List<Integer>> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            h.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=-(nums[i]+nums[j]);
                if(h.containsKey(sum)){
                    int x=h.get(sum);
                    if(x!=i && x!=j){
                        List<Integer> a=new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[x]);
                        Collections.sort(a);
                        set.add(a);
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> li:set){
            ans.add(li);
        }
        return ans;
    }
}
