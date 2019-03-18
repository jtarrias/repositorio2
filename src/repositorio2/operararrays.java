package repositorio2;

public class operararrays {
	public static int[] rellenaArrays(int x[]) {
		for (int i = 0; i < x.length; i++) {
			x[i] = (int) Math.round(Math.random() * 20);
		}
		return x;
	}
	
	public static void imprimeArray(int x[]) {
		for (int i = 0; i < x.length; i++) {
			System.out.println("Numero " + (i + 1) + ":" + x[i]);
		}
	}
	
	public static void sumaArray(int x[]) {
		int j = 0;
		for (int i = 0; i < x.length; i++) {
			j += x[i];
		}
		System.out.println("El resultado de la suma es " + j);
	}

	public static void main (String[] args) {
		int array[] = new int[10];
		rellenaArrays(array);
		imprimeArray(array);
		sumaArray(array);
	}
}
