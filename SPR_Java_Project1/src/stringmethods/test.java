package stringmethods;

public class test {

	public static void main(String[] args) {
		
		String city = "Hyderabad";
		String car = " Nexon";
		String type = "Petrol";
		
		int a = city.length();
		// length
		System.out.println("a="+a);
		// concat
		System.out.println(city.concat(car));
		System.out.println(car.concat(type).concat(city));
		// trim
		System.out.println(car.trim());
		// charAt
		System.out.println(city.charAt(3));
		// contains
		System.out.println(city.contains("ra"));
		// tolowercase
		System.out.println(city.toLowerCase());
		// touppercase
		System.out.println(city.toUpperCase());
		// replace
		System.out.println(city.replace("bad", "good"));
		// equals
		System.out.println(city.equals("HYDERAbad"));
		// equalsignorecase
		System.out.println(city.equalsIgnoreCase("HYDERABAD"));
		// substring
		System.out.println(city.substring(6,8));
		
	}

}

