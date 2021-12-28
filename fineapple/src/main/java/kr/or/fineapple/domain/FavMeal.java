package kr.or.fineapple.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FavMeal {
	
	String userId;
	int userServiceNo;
	int favMealNo;
	int favMealInfoNo;
	String favMealName;
	double favMealKcal;
	Food food;
	double Intake;
	
	
	public FavMeal() {
		// TODO Auto-generated constructor stub
	}

}
