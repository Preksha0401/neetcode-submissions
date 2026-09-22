class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap <Character,Integer> h=new HashMap<>();
        for(char c:s.toCharArray()){
                h.put(c,h.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!h.containsKey(c)){
                return false;
            }
            int cnt=h.get(c)-1;

            if(cnt==0){
                h.remove(c);
            }else if(cnt<0){
                return false;
            }else{
                h.put(c,cnt);
            }
        }
        return h.isEmpty();
    }
}
