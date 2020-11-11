package check;

public class Check {
	
	private  static String firstName = "英史";
	private  static String lastName = "安井";
	
	private void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド →" + " " + lastName + firstName);
	}
	
	public static void main(String[] args) {
		Check check = new Check();
		check.printName(firstName, lastName);
		Pet pet = new Pet(constants.Constants.CHECK_CLASS_JAVA, constants.Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robotPet = new RobotPet(constants.Constants.CHECK_CLASS_R2D2, constants.Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}
	
}

/*
 * 【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
なお、変数のアクセス修飾子は「private」とする。

課題②
【Check.java】にてfirstNameとlastNameを引数で受け取って、
連結して表示させるメソッド「printName」を作成しなさい。
作成した関数のアクセス修飾子は「private」とする。

課題③
【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。
*/

