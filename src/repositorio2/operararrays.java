package repositorio2;

public class operararrays {
	public static int[] rellenaArrays(int x[]) {
		for (int i = 0; i < x.length; i++) {
			x[i] = (int) Math.round(Math.random() * 20);
		}
		return x;
	}

	public static void main(String[] args) {
		int array[] = new int[10];
		rellenaArrays(array);
	}
}


//dnidfiefef