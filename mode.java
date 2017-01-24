package files;

public final class mode implements org.omg.CORBA.portable.IDLEntity{
	private int value = -1;
	private static int read_only = 0;
	private static int write_append = 1;
	private static int write_trunc = 2;
	private static int read_write = 3;
	
	public int value(){
		return this.value;
	}
	
	public static int from_int(int value){
		switch(value){
			case 0 : return read_only;
			case 1 : return write_append;
			case 2 : return write_trunc;
			case 3 : return read_write;
			default : return -1;
		}
	}
}
