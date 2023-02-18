package files;

public class inputdata {

	public static String AddUser() 
	{
		return "{\r\n"
				+ "        \"id\": 27,\r\n"
				+ "        \"employee_name\": \"Tiger\",\r\n"
				+ "        \"employee_salary\": 320800,\r\n"
				+ "        \"employee_age\": 16,\r\n"
				+ "        \"profile_image\": null\r\n"
				+ "    }";
	}

	public static String UpdateUser() 
	{
		return "{\r\n"
				+ "            \"employee_name\": \"VetriVel Muruga\",\r\n"
				+ "            \"employee_salary\": 675000,\r\n"
				+ "            \"employee_age\": 40,\r\n"
				+ "            \"profile_image\": \"\"\r\n"
				+ "        }";
	}
}
