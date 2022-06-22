/*
  Abstract class that defines set of methods that is devided in small picess of work

*/
abstract public class BritishNumberBuilder {
	
	abstract public String getMillionWord(int number) throws Exception;
	abstract public String getThousandWord(int number)throws Exception;
	abstract public String getHundredWord(int number)throws Exception;
	

}
