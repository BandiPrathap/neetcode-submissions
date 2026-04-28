class Solution {

    private int differenceAdjacent(int a,int b){
        if(a>b){
            return a-b;
        }
        return b-a;
    }
    public int scoreOfString(String s) {

        int score = 0;
        for(int i=0;i<s.length()-1;i++){
            score += differenceAdjacent((int) s.charAt(i), (int) s.charAt(i+1));
        }

        return score;
        
    }
}