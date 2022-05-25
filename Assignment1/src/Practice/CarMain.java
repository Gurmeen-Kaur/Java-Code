package Practice;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car objCamry = new Car();
		Car objCamaro = new Car();
		Car objBenz = new Car();
		Car objCaprice = new Car();
		Car objSonata = new Car();

		objCamry.make = "Camry";
		objCamry.year = 2019;
		objCamry.model = "SE";

		objCamaro.make = "Camaro";
		objCamaro.year = 2016;
		objCamaro.model = "ZL1";

		objBenz.make = "Benz";
		objBenz.year = 2020;
		objBenz.model = "E200";

		objCaprice.make = "Caprice";
		objCaprice.year = 2017;
		objCaprice.model = "Caprice1";

		objSonata.make = "Sonata";
		objSonata.year = 2021;
		objSonata.model = "Sport";
		
		System.out.println(objCamaro.make);
		objCamaro.setMake();
		System.out.println(objCamaro.make);

	}

}
