class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int i = 0;
        for(;;){
            if(money >= 5500){
                money -= 5500;
                i++;
            }
            else{
                answer[0] = i;
                answer[1] = money;
                break;
            }
        }
        return answer;
    }
}