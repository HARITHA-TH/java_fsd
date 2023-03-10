package ustbatchno3.junit5testcases;


import java.util.stream.IntStream;

public class Gold {

	public static long test(long noOfDaysBetween, IntStream stream) {
		// TODO Auto-generated method stub
		return 5;
	}

	public static long test1(long noOfDaysBetween, IntStream stream1) {
		// TODO Auto-generated method stub
		return 3;
	}

	public static long test2(long noOfDaysBetween, IntStream stream2) {
		// TODO Auto-generated method stub
		return 2;
	}

	public static long test3(long noOfDaysBetween, IntStream stream3) {
		// TODO Auto-generated method stub
		return 0;
	}

}







//
//public class Test_goldcoin {
//	@Test
//	public void isgoldcoin()
//	{
//		
//		
//		@SuppressWarnings("unused")
//		Getgoldcoins find= new Getgoldcoins();
//		
//		assertEquals(" ",find.findgold(LocalDate.of(2022,12,31)));
////		LocalDate dateBefore=LocalDate.of(2023, Month.JANUARY, 1);
////		LocalDate dateAfter=LocalDate.of(2023, Month.MARCH, 22);;
////		Period age = Period.between(dateBefore, dateAfter);
////		int days = age.getDays();
////		
////		int expected = 5;
//		
//		
//	}
//
//
//import java.time.LocalDate;
//import java.time.Month;
//
///**
// * @author Administrator
// *
// */
//public class Getgoldcoins {
//
//	public String  findgold(LocalDate date) {
//		int dayOfYear=date.getDayOfYear();
//		
//		if (dayOfYear<80 ||dayOfYear>365) {
//			return "****";
//		}
//		else if(dayOfYear>80&&dayOfYear<=172)
//		{
//			return "***";
//		}
//		else if(dayOfYear>172&&dayOfYear<=266)
//		{
//			return"*";
//		}
//		else if (dayOfYear>265&&dayOfYear<=365)
//		{
//			return " ";
//		}
//		return "0";
//	
//		
//	}
//
//}
//}



