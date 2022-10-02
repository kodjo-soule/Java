class ZEchangerVar {
	public static void main(String[] args) {
		int var1 = 13, var2 = 8, temp;
		System.out.println("a = : " + var1 + "\n" + "b : " + var2);

		temp = var1;
		var1 = var2;
		var2 = temp;

		System.out.println("a = : " + var1 + "\n" + "b : " + var2);

	}
}
