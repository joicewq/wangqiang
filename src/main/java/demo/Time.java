package demo;



import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		String starOrend = printIn();
		String[] time = starOrend.split(":");
		
			int s1 = Integer.parseInt(time[0].toString());//开始时间的时针
			int ss1 = Integer.parseInt(time[1].toString());//开始时间分针
			int ss2 = Integer.parseInt(time[2].toString());//开始时间分针
			int f2 = Integer.parseInt(time[3].toString());//结束时间的时针
			int ff2 = Integer.parseInt(time[4].toString());//结束时间分针
			int ff3 = Integer.parseInt(time[5].toString());//结束时间分针
			if(ff3-ss2<0){
					ff2 = ff2-1;
					ff3 = ff3+60;
			}
			if(ff2-ss1<0){
			    f2 =f2-1;
			    ff2=ff2+60;
			}
			
			int Int = (((f2-s1)*60)+ff2)/(720/11);
			
		
		System.out.println("时针和分钟重合次数："+Int);
		//System.out.println("时针和分钟重合次数："+Int1);
	}
	public static  String printIn(){
		System.out.println("请入开始时间和结束时间已:分隔:");
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		return time.trim();
	}

}
