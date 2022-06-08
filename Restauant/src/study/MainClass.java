package study;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Iterator;
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
				System.out.println("음식점 이름을 입력해주세요");
				sc.nextLine();
				String title = sc.nextLine();

				System.out.println("대표 메뉴를 입력해주세요");
				String mainDish = sc.nextLine();

				System.out.println("평점을 입력해주세요");
				int point = sc.nextInt();
				sc.nextLine();

				System.out.println("가격를 입력해주세요");
				int price = sc.nextInt();

				LocalDate rgstDate = LocalDate.now();
				LocalDate updtDate = LocalDate.now();

				manager.createData(title, mainDish, point, price, rgstDate, updtDate);
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.update();
				break;
			case 4:
				break;
			case 5:
				// 조회 set에서 꺼내기
				System.out.println("식당명\t대표음식\t평점\t가격\t등록일\t\t수정일");
				Iterator<Restaurant> iter = manager.resList.iterator();
				while (iter.hasNext()) {
					Restaurant r = iter.next();
					System.out.println(
						r.getTitle() + "\t" 
						+ r.getMainDish() + "\t"
						+ r.getPoint() + "\t" 
						+ r.getPrice() + "\t"
						+ r.getRgstDate() + "\t" 
						+ r.getUpdtDate()
					);
				}
				break;
			case 6:
				break;
			}
		}
	}

}
