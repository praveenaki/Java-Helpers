public class RateAlgorithm{
	public static void main(String args[]){

		long check_time = System.currentTimeMillis();
		int msgs_sent_count = 0;
		int msgs_per_sec = 20000;

		while(true){
			
			while(msgs_sent_count <= (msgs_per_sec) && ((System.currentTimeMillis() - check_time) < 1000)){
				System.out.println("Hello" + "\t" + msgs_sent_count);
				msgs_sent_count++;
			}
			
			if (System.currentTimeMillis() - check_time > 5000) {		
				check_time = System.currentTimeMillis();
				msgs_sent_count = 0;
			}

			//System.out.println("Out of while loop" + msgs_per_5sec + "\t"+ msgs_per_5sec);
		}
	}
}