package com.bvr.controller;

public class Days {

private final int month;
private final int day;
private final int year;

public Days(int m, int d, int y) {
if (!increment(m, d, y))
throw new RuntimeException("Invalid");
month = m;
day = d;
year = y;
}
private static boolean increment(int m, int d, int y) {
int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
if (m < 1 || m > 12)
return false;
if (d < 1 || d > DAYS[m])
return false;
if (m == 2 && d == 29 && !isLeapYear(y))
return false;
return true;
}
private static boolean isLeapYear(int y) {
if (y % 400 == 0)
return true;
if (y % 100 == 0)
return false;
return (y % 4 == 0);
}
public Days next() {
if (increment(month, day + 1, year))
return new Days(month, day + 1, year);
else if (increment(month + 1, 1, year))
return new Days(month + 1, 1, year);
else
return new Days(1, 1, year + 1);
}
public String toString() {
return year + "-" + month + "-" + day;
}
/*public static void main(String[] args) {
	int month=12;
	int day=31;
Date today = new Date(month,day,2013);
System.out.println(today);
for (int i = 0; i < 5; i++) {
today = today.next();
System.out.println(today);
}
}*/
}
