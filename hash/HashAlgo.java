import java.util.HashMap;

class HashAlgo {
	public static void main(String[] args) {
		String[] participant = {"aa","bb","cc"};
		String[] completion = {"aa","bb"};
		solution(participant, completion);
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();

   		for (String player:participant) {
                        System.out.println(hm.getOrDefault(player,0)+1);
                        hm.put(player, hm.getOrDefault(player,0)+1);
                }		
		System.out.println(hm.toString());

		System.out.println("participant is complete");
		for (String player:completion) {
			hm.put(player,hm.get(player)-1);
		}
		System.out.println(hm.toString());

		for(String key : hm.keySet()) {
			System.out.println("key value:" +  hm.get(key));
			if(hm.get(key) != 0) {
				answer = key;
			}		
		}
		System.out.println("answer :: " + answer);
		return answer;				
	}
}
