package Ch19Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex2 {

	public static void main(String[] args) {
		
		//1 ~ 45까지 숫자를 6개 랜덤으로 받아(Random클래스를 이용) set에 저장
		//[추가] 저장된 set의 오름차순정렬을 해보세요(검색을 통해서 해결해봅니다)
		
		Set<Integer> set = new HashSet();
		Random r = new Random();
		while(true) {
			if(set.size()==6) {
				break;
			}
			System.out.println(r.nextInt(45)+1);
			set.add(r.nextInt(45)+1);
		}
		
//		for(Integer el : set) {
//			System.out.print(el + " ");
//		}
		
		//Set -> list
		List<Integer> list = new ArrayList();
		Collections.sort(list);	//오름차순
		for(Integer el : list) {
			System.out.println(el + " ");
		}
		
		//Stream함수를 이용해서 Set -> List
		List<Integer> list2 = set.stream()
								.sorted()
								.collect(Collectors.toList());
		System.out.println();
		for(Integer el : list2) {
			System.out.print(el + " ");
		}
		

	}

}
