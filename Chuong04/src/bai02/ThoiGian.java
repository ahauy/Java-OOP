package bai02;

public class ThoiGian {
    private int day, month, year;

    public ThoiGian() {
        super();
    }

    public ThoiGian(int day, int month, int year) throws InvalidDateException{
        super();
        // kiem tra nam xem co hop le hay khong !
        if(year <= 0) {
            throw new InvalidDateException("Nam khong hop le !! Nam phai lon hon 0.");
        }
        // kiem tra thang
        if(month < 1 || month > 12) {
            throw new InvalidDateException("Thang khong hop le !! Thang phai thuoc khoang [1...12].");
        }
        // kiem tra ngay 
        if(day < 1 || day > 31) {
            throw new InvalidDateException("Ngay khong hop le !! Ngay chi co the thuoc trong khoang [1...12].");
        }

        if(month == 2) {
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                if(day > 29) {
                    throw new InvalidDateException("Thang 2 cua nam nhuan chi co toi da 29 ngay !!");
                }
            }
            else {
                if(day > 28) {
                    throw new InvalidDateException("Thang 2 cua nam khong nhuan chi co toi da 28 ngay !!");
                }
            }
        }
        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if(day > 31) {
                throw new InvalidDateException("Ngay khong hop le !! Thang " + month + " chi co toi da 31 ngay.");
            }
        }
        else {
            if(day > 30) {
                throw new InvalidDateException("Ngay khong hop le !! Thang " + month + " chi co toi da 30 ngay.");
            }
        }

        // neu all hop le thi gan :
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Thoi gian: " + day + "/" + month + "/" + year; 
    }
}
