class Solution {
    public int longestConsecutive(int[] nums) {
        // 01123456
        // 23445 10 20
        if(nums.length==0)  return 0;
        Arrays.sort(nums);
        int prev=nums[0];
        int cnt=0;int len=0;
        for(int i=1;i<nums.length;i++){
            if(prev==nums[i]) continue;
            if(Math.abs(prev-nums[i])==1) cnt++;
            else cnt=0;
            len=Math.max(len,cnt);
            prev=nums[i];
        }
        return len+1;
    }
}
