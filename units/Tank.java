package units;

/**
 * Created by md_etrufkina on 19.07.2018.
 */
public class Tank {
	private String   player;        // имя игрока с танком
	private byte     armour;        // броня (0..100)
	private byte     projectiles;   // количество снарядов 0..10
	private byte     damage;        // коэффициент повреждения танка 0..100
	private byte     x;             // координата x на карте 0..10
	private byte     y;             // координата y на карте 0..10
	// добавить конструктор и методы, указанные выше
	// добавить геттеры и сеттеры

	public Tank(String player, byte armour, byte projectiles, byte damage, byte x, byte y ){
		this.player = player;
		this.armour = armour;
		this.projectiles = projectiles;
		this.damage= damage;
		this.x = x;
		this.y = y;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public byte getArmour() {
		return armour;
	}

	public void setArmour(byte armour) {
		this.armour = armour;
	}

	public byte getProjectiles() {
		return projectiles;
	}

	public void setProjectiles(byte projectiles) {
		this.projectiles = projectiles;
	}

	public byte getDamage() {
		return damage;
	}

	public void setDamage(byte damage) {
		this.damage = damage;
	}

	public byte getX() {
		return x;
	}

	public void setX(byte x) {
		this.x = x;
	}

	public byte getY() {
		return y;
	}

	public void setY(byte y) {
		this.y = y;
	}


	@Override
	public String toString(){
		return "\nИмя игрока " + player + " броня (0..100)" + armour +  " количество снарядов 0..10 " + projectiles +
			" коэффициент повреждения танка 0..100" + damage + " координата x на карте 0..10" + x + " координата y на карте 0..10 " + y;
	}

	public boolean isFunctional(){
		if( damage <= 50 && armour >= 25){
			return true;
		}
		return false;
	}

	public double distance(Tank other_tank){
		double d = Math.sqrt(Math.pow(Math.abs(x - other_tank.getX()),2) + Math.pow(Math.abs(y - other_tank.getY()),2));
		return d;
	}

	public void shoot(Tank other_tank){
//		объявить метод shoot(Tank other_tank) который получает в качестве параметра другой танк.
// При каждом вызове shoot() танк, в который стреляют, будет терять 100% брони в случае если расстояние между ним и стреляющим танком составляет 0;
// если расстояние 1 - 90%, и так далее - с каждой единицей расстояния, броня снижается на 10%.
// Для того, чтобы вычислить полученный "damage" применять формулу damage+= 100/(armour+1),
// то есть чем больше "armour" тем меньше повреждения (damage) получает танк.

double d = distance(other_tank);

		armour = (byte) (armour - ((10-d)*0.1)*armour);
		damage+= 100/(armour+1);

//		switch ((int) distance(other_tank))
//		{
//			case 0:  armour = 0;
//				break;
//			case 1:  armour = (byte) (armour - (byte)(armour*0.9));
//				break;
//			case 2:  armour = (byte) (armour - (byte)(armour*0.8));
//				break;
//			case 3:  armour = (byte) (armour - (byte)(armour*0.7));
//				break;
//			case 4:  armour = (byte) (armour - (byte)(armour*0.6));
//				break;
//			case 5:  armour = (byte) (armour - (byte)(armour*0.5));
//				break;
//			case 6:  armour = (byte) (armour - (byte)(armour*0.4));
//				break;
//		}

	}
}
