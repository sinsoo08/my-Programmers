class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = 2 * a * b;
        int d = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        
        if(c > d){
            answer = c;
        }
        else if(c < d){
            answer = d;
        }
        else{
            answer = d;
        }
        return answer;
    }
}