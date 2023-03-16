package ch6;

public class Student2 {
	//학생이름 name ex)홍길동
	String name;
	//반 ban ex)1
	int ban;
	//번호 no ex)1
	int no;
	//국어점수 kor ex)100
	int kor;
	//영어점수 eng ex)60
	int eng;
	//수학점수 math ex)76
	int math;
		
	
	public Student2(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}


	public Student2(String name,int ban,int no, int kor, int eng, int math) {
		super();
		this.name =name;
		this.ban =ban;
		this.no =no;
		this.kor =kor;
		this.eng = eng;
		this.math =math;
	}
	int getTotal(){
		return this.kor+this.eng+this.math;
		
	}
	double getAverage(){
		return getTotal()/3.0;
	}


	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	

	
//	String info() {
//		int sum = kor+eng+math;
//		double avg = (double)sum/3;
//		
//		return this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
//	}	
}
