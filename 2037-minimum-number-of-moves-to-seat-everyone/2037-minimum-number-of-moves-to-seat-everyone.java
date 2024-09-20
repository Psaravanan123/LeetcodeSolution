class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;
        for(int i=0;i<seats.length;i++){
               int rev=seats[i]-students[i];
               sum+=rev;
        }
        if(sum<0){
            sum*=-1;
        }
        return sum;
    }
}