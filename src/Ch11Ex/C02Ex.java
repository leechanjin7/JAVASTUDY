package Ch11Ex;

import java.util.Scanner;

public class C02Ex {

	public static void main(String[] args) {
		//5명의 학생에 국영수점수를 입력받아 2차원배열에 저장하고
		//각 학생의 국영수 점수의 합/평균을 구하고
		//각 과목당 합 / 평균을 구해보세요
		
		int [][] score = new int[5][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("국영수 점수를 차례대로 입력 : ");
		for(int i=0; i<score.length;i++) {
			for(int j=0;j<score.length; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		
		//각 학생별(행 별) 국영수 총합 /평균
		int stdsum[] = new int[5];
		double stdavg[] = new double[5];
		for(int i=0; i<score.length;i++) {
			for(int j=0;j<score.length; j++) {
				stdsum[i] += score[i][j];
			}
			stdavg[i] = stdsum[i]/3;
		}
		for(int i=0; i<5; i++) {
			System.out.printf("%d 번째 학생점수 : %d %f\n", i,stdsum[i],stdavg[i]);
		}
		
		int subjectSum[] = new int[3];
		double subjectAvg[] = new double[3];
		for(int j=0;j<3;j++) {
			for(int i=0;i<5;i++) {
				subjectSum[j]+=score[i][j];
			}
			subjectAvg[j] = subjectSum[j]/score.length;
			
		}
		System.out.printf("국영수 총합 : %d %d %d \n" , subjectSum[0],subjectSum[1],subjectSum[2]);
		System.out.printf("국영수 평균 : %f %f %f \n" , subjectAvg[0],subjectAvg[1],subjectAvg[2]);
		
	}

}
