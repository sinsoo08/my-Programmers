class Solution {
    public int[] solution(int n) {
        int j = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                j++;
            }
        }
        
        int[] answer = new int[j];
        
        int in = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer[in] = i;
                in++;
            }
        }
        return answer;
    }
}