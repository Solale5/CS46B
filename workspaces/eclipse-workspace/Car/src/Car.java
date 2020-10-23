
public class Car
{
 private int gas = 10;
 private int mileage = 0;
 
 public Car(int tgas, int tmilage)
 {
	 tgas = this.gas;
	 tmilage = this.mileage;
 }
 
 public void driveTenMiles()
 {
	 if (gas >= 10)
	 {
	 gas = gas - 10;
	 mileage = mileage + 10;
	 }
	 else 
	 {
		 System.out.print("you dont have enough gas");
	 }
 }
public int checkGas()
{
	return gas;
}
public int checkMileage()
{
	return mileage;
}

public static void main(String[] args) 
{
	// TODO Auto-generated method stub
	Car honda = new Car (10,0);
	honda.driveTenMiles();
	System.out.println(honda.checkGas());
	System.out.println(honda.checkMileage());
}

	 
}

