package templatemethod;

public class TemplateMethodMain {

	public static void main(String[] args) {
		DataParser csvDataParser=new CSVDataParser();
        csvDataParser.parseDataAndGenerateOutput();
        
        System.out.println("**********");
        DataParser databaseDataParser=new DatabaseDataParser();
        databaseDataParser.parseDataAndGenerateOutput();
	}

}
