package najah.edu;

public class chekout {
	 int totalprice=0;
		public void add(Integer itemcount, Integer integer) {
			// TODO Auto-generated method stub
			totalprice += (itemcount * integer);
		}

		public int total() {
			// TODO Auto-generated method stub
			return totalprice;
		}
}
