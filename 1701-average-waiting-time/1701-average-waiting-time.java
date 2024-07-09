class Solution {
    public double averageWaitingTime(int[][] arr) {
        int n = arr.length;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sum = arr[i][0] + arr[i][1];
                System.out.print(sum + " ");
                list.add(sum - arr[i][0]);
            }

            else {

                System.out.print(sum + " ");
                if (sum >= arr[i][0]) {

                    sum += arr[i][1];
                    list.add(sum - arr[i][0]);
                } else {
                    sum = arr[i][0] + arr[i][1];
                    list.add(sum - arr[i][0]);
                }
            }
        }
        System.out.print(list);
        double count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);

        }
        return count / list.size();
    }
}