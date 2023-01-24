public class Main {
	public static void main(String[] args) {
		Battery battery = new Battery(98);
		Smartphone phone = new Smartphone(battery);
		phone.setName("Samsung");
		phone.open();
	}
}
