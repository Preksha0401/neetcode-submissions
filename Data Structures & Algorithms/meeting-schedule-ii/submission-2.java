/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()<1) return 0;
        intervals.sort((a,b)->{
            if(a.start!=b.start) return a.start-b.start;
            return a.end-b.end;
        });

        int cnt=1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();        
        pq.add(intervals.get(0).end);
        for(int i=1;i<intervals.size();i++){
            if(pq.peek()<=intervals.get(i).start) {
                pq.remove();
            }
            else if(intervals.get(i-1).end>intervals.get(i).start) cnt++;
            pq.add(intervals.get(i).end);
        }
        return cnt;
    }
}
