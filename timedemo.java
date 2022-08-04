class time{
	int hour;
	int minute;
	int second;
	public time(int hour,int minute,int second){
		this.second=second;
		this.minute=minute;
		this.hour=hour;	
	}
	void add(time t){
		this.second+=t.second;
		if(this.second>=60){
			this.minute++;
			this.second-=60;
		}
		this.minute+=t.minute;
		if (this.minute>=60) {
			this.hour++;
			this.minute-=60;
		}
		this.hour+=t.hour;
	}
}
public class timedemo{
	public static void main(String[] args) {
		time t1=new time(11,59,55);
		time t2=new time(0,0,5);

		t1.add(t2);

		System.out.println("hours :"+t1.hour);
		System.out.println("minute :"+t1.minute);
		System.out.println("second :"+t1.second);
	}
}