package study;
/*
 * Manager class
 * 제어 class
 */

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
/*
 * 제어 클래스
 */
public class RestauantManager {

	final int MAX = 100;
	int count = 0;
	String title;
	HashSet<Restaurant> resList = new HashSet<>();
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 식당 정보를 입력한다.
	 * @param title
	 * @param mainDish
	 * @param point
	 * @param price
	 * @param rgstDate
	 * @param updtDate
	 */
	void createData(String title, String mainDish, int point, int price, LocalDate rgstDate, LocalDate updtDate) {
		count++;
		resList.add(new Restaurant(title, mainDish, point, price, rgstDate, updtDate));
		System.out.println("입력이 완료 되었습니다.");
	}
	/**
	 * 식당 이름으로 검색결과를 돌려준다.
	 */
	void searchData() {
		System.out.println("검색할 식당명을 입력해주세요 : ");
		title = sc.nextLine(); 
		boolean isExist = false;	
		//순회
		Iterator<Restaurant> iter = resList.iterator();
		while (iter.hasNext()) {
			Restaurant r = iter.next();
			if (title.equals(r.getTitle())) {
				r.showInfo();
				isExist = true;
				break;
			}
		}
		System.out.println(isExist == true ?  "" : "해당하는 식당 데이터가 없습니다 \n");
	}
	
	void update() {
		System.out.println("변경을 원하시는 식당명을 입력해주세요 : ");
		title = sc.nextLine();
		boolean isExist = false;
		
		System.out.println("수정할 식당명을 입력해주세요 : ");
		String updtTitle = sc.nextLine();
		//순회
		Iterator<Restaurant> iter = resList.iterator();
		while (iter.hasNext()) {
			Restaurant r = iter.next();
			if (title.equals(r.getTitle())) {
				r.setTitle(updtTitle);     
				isExist = true;
				System.out.println("데이터 수정 완료");
				break;
			}
		}
		System.out.println(isExist == true ?  "" : "해당하는 식당 데이터가 없습니다 \n");
	}
	
}
