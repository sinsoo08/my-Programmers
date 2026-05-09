import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : array){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        int answer = -1;
        for(int key : map.keySet()){
            int count = map.get(key);
            
            if(count > max){
                max = count;
                answer = key;
            } 
            else if(count == max){
                answer = -1;
            }
        }
        return answer;
    }
}