package chap04;

public class ArrayInArrayExample {

	public static void main(String[] args) {
	
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores.length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="
						+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores.length; k++) {
				System.out.println("engScores["+i+"]["+k+"]="
						+englishScores[i][k]);
		
	}

}
		System.out.println();
		int[][] javaScores = new int[2][];
		javaScores[0] = new int[2];
		javaScores[1] = new int[3];
		
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores.length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="
						+javaScores[i][k]); 
			}
		}
	}
}
