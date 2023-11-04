package practise1;

public class drivercar {

	public static void main(String[] args) {
		car c=new car();
		c.setColor("blue");
		c.setCompany("honda");
		c.setModel("civic");
		c.setPrice(10000);
		
		engine e=new engine();
		e.setCc("1300");
		e.setMilege("12");
		e.setRpm("12000");
		e.setType("petrol");
		
		c.setE(e);
		
		System.out.println(c.getCompany());
		System.out.println(c.getColor());
		System.out.println(c.getPrice());
		System.out.println(c.getModel());
		
		System.out.println(e.getCc());
		System.out.println(e.getMilege());
		System.out.println(e.getRpm());
		System.out.println(e.getType());;

	}

}
