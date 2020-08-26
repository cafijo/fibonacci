package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciService {
	
	public long getFibonacciPosition(int position){
		return fibonacci(position);
	}
	
	public List<Long> getFibonacciSequence(int counter){
		List<Long> result = new ArrayList<Long>();
		for(int i = 0; i<counter; i++) {
			result.add(fibonacci(i));
		}
		return result;
	}
	
	public long fibonacci(long position) {
		if (position < 2)
			return position;
		return fibonacci(position - 1) + fibonacci(position - 2);
	}

}
