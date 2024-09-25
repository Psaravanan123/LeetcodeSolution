class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }

        int mod = year % 100;
        int j = year / 100;
        int h = (day + ((13 * (month + 1)) / 5) + mod + (mod / 4) + (j / 4) - 2 * j) % 7;
        if (h < 0) {
            h = (h + 7) % 7;
        }

        switch (h) {
            case 0: return "Saturday";
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
        }
        return "Invalid";
    }
}
