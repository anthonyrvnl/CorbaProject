package files;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;

public class regular_fileImpl extends regular_filePOA{

	POA _poa;
	private int offset;
	private int size_of_file;
	private String name;
	private String data_file;

	public regular_fileImpl(POA poa, String name){
		this._poa = poa;
		this.name = name;
		this.offset = 0;
		this.size_of_file = 0;
		this.data_file = "";
	}

	public int read(int size, StringHolder data) throws end_of_file, invalid_operation{
		if(size >= size_of_file) throw new end_of_file();

		return 0;
	}

	public int write(int size, String data) throws invalid_operation{
		return 0;
	}

	public void seek(int new_offset) throws invalid_offset, invalid_operation{

	}

	public void close(){

	}

}
