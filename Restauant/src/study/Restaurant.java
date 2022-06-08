package study;
/*
 * java beans
 */

import java.time.LocalDate;
/*
 * java beans
 */
public class Restaurant {
	String title; // 상호명
	String mainDish; // 대표메뉴
	int point; // 평점
	int price; // 가격
	LocalDate rgstDate; // 등록일
	LocalDate updtDate; // 수정일
	
	public Restaurant(String title, String mainDish, int point, int price, LocalDate rgstDate, LocalDate updtDate) {
		super();
		this.title = title;
		this.mainDish = mainDish;
		this.point = point;
		this.price = price;
		this.rgstDate = rgstDate;
		this.updtDate = updtDate;
	}

	/*
	 * 상호명을 돌려준다.
	 */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * 대표 메뉴를 돌려준다.
	 */
	public String getMainDish() {
		return mainDish;
	}

	public void setMainDish(String mainDish) {
		this.mainDish = mainDish;
	}

	/*
	 * 평점을 돌려준다.
	 */
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	/*
	 * 가격을 돌려준다.
	 */
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/*
	 * 등록일을 돌려준다.
	 */
	public LocalDate getRgstDate() {
		return rgstDate;
	}

	public void setRgstDate(LocalDate rgstDate) {
		this.rgstDate = rgstDate;
	}

	/*
	 * 수정일을 돌려준다.
	 */
	public LocalDate getUpdtDate() {
		return updtDate;
	}

	public void setUpdtDate(LocalDate updtDate) {
		this.updtDate = updtDate;
	}

	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("식당명\t대표음식\t평점\t가격\t등록일\t\t수정일");
		System.out.println(
				this.getTitle() + "\t" 
				+ this.getMainDish() + "\t"
				+ this.getPoint() + "\t" 
				+ this.getPrice() + "\t"
				+ this.getRgstDate() + "\t" 
				+ this.getUpdtDate()
			);
	}

}
