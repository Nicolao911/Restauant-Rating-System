package study;

import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * subject : 음식점 평점(2022.06.07 ~ 2022.06.08)
		 * 
		 * CRUD --> file IO 사용해서 물리파일 내리기 평점 기준 sort --> swap 알고리즘 사용해보기
		 * 
		 * Columns : 상호명(title) 대표메뉴(main_dish) 평점(point) 가격(price) rgst_date, updt_date
		 * 
		 * 고도화 1. 각 Column 별 Custom Sorting 2. 대표 메뉴 가격뿐만 아니라 각 지점별 메뉴와 가격으로 데이터 구조 확장
		 * 
		 */
		RestauantManager manager = new RestauantManager();

		while (true) {
			Menu.showMenu();
			int input = sc.nextInt();
			switch (input) {
			case 1:
				manager.insert();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.update();
				break;
			case 4:
				manager.delete();
				break;
			case 5:
				manager.list();
				break;
			case 6:
				System.exit(0);
				break;
			}
		}
	}

}
