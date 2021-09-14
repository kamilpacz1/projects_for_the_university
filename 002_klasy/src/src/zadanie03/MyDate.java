package zadanie03;

public class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int day, int month, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 0 || month > 12) {
            System.out.println("Niepoprawna wartość miesiąca: " + month);
        } else {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 0 || day > 31) {
            System.out.println("Niepoprawna wartość dnia: " + day);
        } else {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1990 || year > 2050) {
            System.out.println("Niepoprawna wartość roku: " + year);
        } else {
            this.year = year;
        }
    }

    public void displayDate() {
        if(day < 10) {
            System.out.print("0");
        }
        System.out.print(day + "/");

        if(month < 10) {
            System.out.print("0");
        }
        System.out.print(month + "/" + year);
    }
}
