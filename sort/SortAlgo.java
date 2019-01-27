import java.util.Arrays;

class SortAlgo {
	public static void main(String[] args) {
		int[] array = {1,5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		solution(array, commands);
	}

	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
	answer = new int[commands.length];

	for(int i=0; i < commands.length; i++) {
		int startIdx = commands[i][0];
		int endIdx = commands[i][1];
		int targetIdx = commands[i][2];
		
		int size = endIdx - startIdx + 1;
		int tmpArray[] = new int[size];
		
		int k=0;
		for(int j=startIdx-1; j<endIdx; j++) {
			tmpArray[k] = array[j];
			k++;
		}
		Arrays.sort(tmpArray);
		answer[i] = tmpArray[targetIdx-1];
	}
	System.out.println(Arrays.toString(answer));
        return answer;
    }
}
