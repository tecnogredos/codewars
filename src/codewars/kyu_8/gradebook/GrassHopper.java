package codewars.kyu_8.gradebook;

import static java.lang.System.out;

import java.util.IntSummaryStatistics;
import java.util.List;

public class GrassHopper {

	public static char getGrade_2(int s1, int s2, int s3) {      
	    return "FFFFFFDCBAA".charAt((s1+s2+s3)/30);
	}
	public static char getGrade(int s1, int s2, int s3) {
		int score = (int)((IntSummaryStatistics)(List.of(s1, s2, s3)
							.stream()
							.mapToInt(a -> a).summaryStatistics()))
					.getAverage();		
		char grade = '_';		
		if(90 <= score && score <= 100 ) {
			grade = Grade.A.getGrade();		
		} else if (80 <= score && score <= 90) {
			grade = Grade.B.getGrade();
		} else if (70 <= score && score <= 80) {
			grade = Grade.C.getGrade();
		} else if (60 <= score && score <= 70) {
			grade = Grade.D.getGrade();
		} else {
			grade = Grade.F.getGrade();
		}
		return grade;
	}

	public static void main(String[] args) {
		out.println('A' == GrassHopper.getGrade(95, 90, 93));
		out.println('A' == GrassHopper.getGrade(100, 85, 96));
		out.println('A' == GrassHopper.getGrade(92, 93, 94));
		out.println('A' == GrassHopper.getGrade(100, 100, 100));

		out.println('B' == GrassHopper.getGrade(70, 70, 100));
		out.println('B' == GrassHopper.getGrade(82, 85, 87));
		out.println('B' == GrassHopper.getGrade(84, 79, 85));

		out.println('C' == GrassHopper.getGrade(70, 70, 70));
		out.println('C' == GrassHopper.getGrade(75, 70, 79));
		out.println('C' == GrassHopper.getGrade(60, 82, 76));

		out.println('D' == GrassHopper.getGrade(65, 70, 59));
		out.println('D' == GrassHopper.getGrade(66, 62, 68));
		out.println('D' == GrassHopper.getGrade(58, 62, 70));

		out.println('F' == GrassHopper.getGrade(44, 55, 52));
		out.println('F' == GrassHopper.getGrade(48, 55, 52));
		out.println('F' == GrassHopper.getGrade(58, 59, 60));
		out.println('F' == GrassHopper.getGrade(0, 0, 0));

	}
}
enum Grade {
	
	A('A'), B('B'), C('C'), D('D'), F('F');
	
	private char grade;
	Grade(char value) {
		this.grade = value;
	}
	public char getGrade() {
		return this.grade;
	}
}
