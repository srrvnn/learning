/*

	Options: Scanner, Reader, Streams 

	If the file is an ASCII file, use Readers
	If the file is a binary file, use Streams

	If the file is huge, use BufferedReader on top of FileReader 

*/

public class InputOutput {

	public static void readURL() {


	}

	public static void readFile() {

		// using BufferedReader

		BufferedReader br = new BufferedReader(new InputStreamReader(source, StandardCharsets.UTF_8));
		StringBuffer text = new StringBuffer();

		for(String line; (line = br.readLine()) != null) 
			text.append(line);		

		/* 

			Comments: 

			1. readLine() doesn't distinguish between /n and /r. 


		*/

		// using Scanner (1)

		Scanner s = new Scanner(source, StandardCharsets.UTF_8).useDelimiter("\\A");
		String text = s.hasNext() ? s.next() : "";

		// using Scanner (2)

		Scanner s = new Scanner(source, StandardCharsets.UTF_8);
		StringBuffer text = new StringBuffer();

		while(s.hasNextLine()) 
			text.append(s.nextLine());

		// using Files

		byte[] encoded = Files.readAllBytes(Paths.get(path));
		String text = encoding.decode(ByteBuffer.wrap(encoded)).toString();

		/*

			Comments: 

			1. Requires memory several times the file. 
			2. It is better wrapped to have the variables go out of scope. 
			3. It is better used on small files. 

		*/
	}

	public static void getCharsets() {

		System.out.println(StandardCharsets.UTF_8);
		System.out.println(Chatset.defaultCharset());
	}
}