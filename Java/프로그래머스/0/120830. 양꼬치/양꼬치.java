class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int a = n / 10;
        answer = n * 12000 + k * 2000;
        if(a > 0){
            answer -= a * 2000;
        }
        return answer;
    }
}