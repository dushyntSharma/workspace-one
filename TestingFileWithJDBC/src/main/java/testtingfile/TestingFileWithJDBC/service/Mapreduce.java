package testtingfile.TestingFileWithJDBC.service;

public class Mapreduce {
	
	// Create an ArrayList
	List<Integer> myList = new ArrayList<Integer>();
	myList.add(1);
	myList.add(5);
	myList.add(8);

	// Convert it into a Stream
	Stream<Integer> myStream = myList.stream();
	
	

	// Create an array
	Integer[] myArray = {1, 5, 8};

	// Convert it into a Stream
	Stream<Integer> myStream = Arrays.stream(myArray);
	
	
	
	Stream<String> myNewStream = 
            myStream.map(s -> s.toUpperCase());

}
