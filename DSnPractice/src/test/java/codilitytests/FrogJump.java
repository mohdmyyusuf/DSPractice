package codilitytests;

public class FrogJump {
	
	private int frogJumpChecker(int x, int y, int D) {
		int dist = y - x;
		int jumps = (int) Math.ceil(dist/(double)D);
		return jumps;
	}
	
	public static void main(String[] args) {
		
		FrogJump obj = new FrogJump();
		int res = obj.frogJumpChecker(10, 85, 30);
		System.out.println(res);
		
	}

	

}
