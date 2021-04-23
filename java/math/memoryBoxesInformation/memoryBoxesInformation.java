/// package jsm.utility.memoryBoxesInformation;

public class memoryBoxesInformation 
{

	/*
	 * fnPrimitiveVariable() - print Primitive Variable value.
	 */
	public void fnPrimitiveVariable()
	{
		System.out.println("\nVariable / Atributes:");
		
		System.out.println("Byte ( " +  Byte.SIZE + " bit +  / " + Byte.BYTES + " bytes ) == " + Byte.MIN_VALUE + " --> " + Byte.MAX_VALUE);  
		System.out.println("Short ( " +  Short.SIZE + " bit +  / " + Short.BYTES + " bytes ) == " + Short.MIN_VALUE + " --> " + Short.MAX_VALUE); 
		System.out.println("int / Integer ( " + Integer.SIZE + " bit ) == " + Integer.MIN_VALUE + " --> " + Integer.MAX_VALUE);
		System.out.println("Long ( " + Integer.SIZE + " bit ) == " + Long.MIN_VALUE + " --> " + Long.MAX_VALUE);	
		System.out.println("char ( " + Character.SIZE + " bit ) == " + Character.MIN_VALUE + " --> " + Character.MAX_VALUE);
        System.out.println("Float ( " + Float.SIZE + " bit ) == " + Float.MIN_VALUE + " <--> " + Float.MAX_VALUE);
        System.out.println("Double ( " + Double.SIZE + " bit ) == " + Double.MIN_VALUE + " <--> " + Double.MAX_VALUE);
	}

	/*
	 * memoryBoxesInformation() constructor
	 */
	public memoryBoxesInformation() 
	{
		fnPrimitiveVariable();
	}

}
