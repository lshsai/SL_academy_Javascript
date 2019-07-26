import java.util.Arrays;
import java.util.Comparator;

public class E05_compare {

	public static void main(String[] args) {
		/*
		 * comparable 인터페이스
		 * 
		 */
		Record[] records = new Record[30];

		for (int i = 0; i < records.length; i++)
			records[i] = new Record();

		Arrays.sort(records, new Comparator<Record>() {

			@Override
			public int compare(Record o1, Record o2) {
				// cmopare 메서드에서 1을 리턴하면 바꾼다 ; -1을 리턴하면 그대로 둔다. 이런 순서대로 정렬된다.
				if (o1.record < o2.record) {
					return 1;
				} else {
					return -1;
				}

			}
		});
		
		for (Record r : records)
			System.out.println(r.record);
	}

}

class Record implements Comparable<Record> {
	double record;

	Record() {
		record = Math.random() * 1000;
	}

	@Override
	public int compareTo(Record o) {
		if (this.record < o.record) {
			return 1;
		}else {
			return -1;	
		}
	}
}
