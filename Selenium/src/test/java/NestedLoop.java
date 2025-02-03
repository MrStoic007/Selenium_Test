

public class NestedLoop {

	public static void main(String[] args) {

		int a[] = { 34, 45, 23, 56, 0 };
		int num = a[0];
		
		//Arrays.sort(a); This is nice 

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					num = a[i];
					a[i] = a[j];
					a[j] = num;
				}

			}
		}
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
