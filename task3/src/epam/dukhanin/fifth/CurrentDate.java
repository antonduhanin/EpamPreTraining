package epam.dukhanin.fifth;

public class CurrentDate {
    private int day;
    private int month;
    private int year;

    private int[] daysMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public CurrentDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String nextDate() {
        if (validateDate() == false) {
            return "Invalid date";
        }

        if (isLeapYear()) {
            daysMonth[1] = 29;
        }

        for (int i = 0; i < 12; i++) {
            if (day <= daysMonth[i] && month == i + 1) {
                changeDate(i);
                return day + "/" + month + "/" + year;
            }
        }
        return "Invalid date, in that month less days";
    }

    private void changeDate(int i) {
        if (daysMonth[i] == day && month == 12) { //last day of year
            year++;
            month = 1;
            day = 1;
        } else if (daysMonth[i] == day && month != 12) { // last day of month
            month++;
            day = 1;
        } else { //next date
            day++;
        }
    }

    private boolean validateDate() {
        boolean dateOk = true;
        if (year <= 0) {
            dateOk = false;
        }
        if (month < 1 || month > 12) {
            dateOk = false;
        }
        if (day < 1 || day > 31) {
            dateOk = false;
        }
        return dateOk;
    }

    private boolean isLeapYear() {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                isLeap = false;
            }
            isLeap = true;
        }

        return isLeap;
    }
}
