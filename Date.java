public class Date{
	private int year;
	private int month;
	private int day;
	//构造方法
	public Date(int year,int month,int day){
		//至少做基本的参数检查
		if(year<1900||year>2100){
			//最好的做法是抛异常
			System.out.println("年不合法"+year);
			return;
		}
		if(month<1||month>12){
			System.out.println("月不合法"+month);
			return;
		}
		if(day<1||day>getDayOfMonth(year,month)){
			System.out.println("日不合法"+day);
			return;
			
		}
		//涉及 name shadow
		this.year=year;
		this.month=month;
		this.day=day;
	}
 //支持方法
 public void add(int days){
	 //days必须是正数
	 if(days<0){
		 System.out.println("days不合法"+ days);
		 return;
	 }
	 day+=days;
	 while(day>getDayOfMonth(year,month)){
		 day -= getDayOfMonth(year,month);
		 month++;
		 if(month>12){
			 month=1;
			 year++;
		 }
	 }
 }
 public void sub(int days){
	 //days必须是正数
	 if(day<0){
		 System.out.println("days不合法"+ days);
		 return;
		 
	 }
	 day -= days;
	 while(day<1){
		 month--;
		 if(month<1){
			 month=12;
			 year--;
		 }
		 day += getDayOfMonth(year,month);
	 }
 }
 public String toString(){
	 return String.format("%04d-%02d-%02d",year,month,day);
 }
 //内部使用的方法，private
 private static final int[] DAY_OF_MONTH={31,28,31,30,31,30,31,31,30,31,30,31};
 private static int getDayOfMonth(int year,int month){
	 int days=DAY_OF_MONTH[month-1];
	 if(month==2&&isLeapYear(year)){
		 days=29;
	 }
	 return days;
 }
 private static boolean isLeapYear(int year){
	 if(( year % 4==0 && year % 100!=0)||year % 400 == 0){
		 
		 return true;
	 }
	 return false;
 }
 public static void main(String[] args){
	 Date date=new Date(2019,5,20);
	 System.out.println(date.toString());
	 date.add(10);
	 System.out.println(date.toString());
	 date.add(10);
	 System.out.println(date.toString());
	 date.sub(22);
	 System.out.println(date.toString());
	 
	 
 }
}
