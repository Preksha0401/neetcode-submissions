class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(t);

        int n=t.length();

        int low=0;int high=n-1;

        while(low<=high){
            
            if(t.charAt(low)!=t.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}
