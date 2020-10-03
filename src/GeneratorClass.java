import java.util.Random;
import java.util.Scanner;

public class GeneratorClass {
	public static void main(String[] args) {
		
		String name = "";
		String[] email = {"87@outlook.com", "52@gmail.com", "99@live.com", "34@hotmail.com", "85@gmail.com", "98@gmail.com", "007@gmail.com"};
		String[] desgination = {"Architect", "Cloud Architect", "Senior Developer", "Software Engineer", "Trainee", "Senior Engineer", "Associate","Lead Developer","Principal Consultant"};
		String[] organization = {"Virtusa", "Polaris", "MuSigma", "Acclaris", "Cybage", "Cognizant", "Syntel","Atos", "Capgemini", "Accenture","IBM", "HCL","Siemens","Synopsys"};
		String mobileNo = "";
		String[] city = {"Pune", "Mumbai", "Bangalore", "Delhi", "Kolkata", "Hyderabad", "Chennai"};
		int m = (int) Math.pow(10, 9 - 1);
		Scanner scn = new Scanner(System.in);
		for (int i=0; i<42;i++) {
		name =  scn.nextLine();
		System.out.println(name);
		System.out.println(name.replaceAll("\\s", "").toLowerCase()+email[new Random().nextInt(email.length)]);
		System.out.println(desgination[new Random().nextInt(desgination.length)]);
		System.out.println(organization[new Random().nextInt(organization.length)]);
		System.out.print("9");
		System.out.println(m + new Random().nextInt(9 * m));
		System.out.println(city[new Random().nextInt(city.length)]);
		System.out.println("");
		}
		scn.close();
	}

}
