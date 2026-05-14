class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double a = 0;
        double b = 0;
        for(int i = 0; i < numbers.length; i++){
            a ++;
            b += numbers[i];
        }
        answer = b / a;
        return answer;
    }
}