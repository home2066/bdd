package Sample;

import static org.testng.Assert.assertEquals;

import files.ComplexJsonInputData;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonPath js1 = new JsonPath(ComplexJsonInputData.courses());

		// Prints the no of courses
		int count = js1.getInt("courses.size()");
		System.out.println(count);

		// Prints the total amount
		int amount = js1.getInt("dashboard.purchaseAmount");
		System.out.println(amount);

		// Prints the first course title
		String course_title1 = js1.getString("courses[0].title");
		System.out.println(course_title1);

		int total_amount = 0;

		for (int i = 0; i < count; i++) {
			String all_course_titles = js1.getString("courses[" + i + "].title");

			int course_price = js1.getInt("courses[" + i + "].price");
			int each_course_copies = js1.getInt("courses[" + i + "].copies");
			int each_amount = course_price * each_course_copies;
			total_amount = total_amount + each_amount;

			System.out.println("The Course title is " + all_course_titles);
			System.out.println("The Course price is " + course_price);
			System.out.println("No Of Copies brought " + each_course_copies);

		}

		// Printing no of copies sold only by RPA
		for (int i = 0; i < count; i++) {
			String all_course_titles = js1.getString("courses[" + i + "].title");

			if (all_course_titles.equalsIgnoreCase("RPA")) {
				int each_course_copies = js1.getInt("courses[" + i + "].copies");
				System.out.println("No Of Copies brought " + each_course_copies);
				break;
			}

		}
		System.out.println("The Total Amount of the books cost is " + total_amount);
		assertEquals(amount, total_amount);
	}

}
