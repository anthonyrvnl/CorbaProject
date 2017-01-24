package files;



public final class directory_entry implements org.omg.CORBA.portable.IDLEntity{

	public java.lang.String name = "";
	public file_type type;
	
	public directory_entry(java.lang.String name, file_type type){
		this.name = name;
		this.type = type;
		
	}


}
