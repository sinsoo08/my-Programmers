import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int a = 0;
        int j = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                a++;
            }
        }
        int[] answer = new int[a];
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[j] = numlist[i];
                j ++;
            }
        }
        return answer;
    }
}