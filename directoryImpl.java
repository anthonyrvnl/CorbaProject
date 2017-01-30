
package files;
import org.omg.CORBA.*;
import java.lang.*;
import org.omg.PortableServer.*;
import java.io.*;

public class directoryImpl extends directoryPOA {

	private int number_of_file;
	private file_list fileList;
	protected POA _poa;
	private String name;

	/*
	 * reference POA
	 * */
	public directoryImpl(POA poa){
		this._poa = poa;
		new File("root").mkdir();
		System.out.println("--Created root directory--");
	}
	
	public directoryImpl(POA poa, String name){
		this._poa = poa;
		this.name = name;
		new File(name).mkdir();
	}

	public void open_regular_file(regular_fileHolder r, String name, mode m) throws invalid_type_file, no_such_file{
		
	}

	public void open_directory(directoryHolder f, String name) throws invalid_type_file, no_such_file{

	}


	public void create_regular_file(regular_fileHolder r, String name) throws already_exist{

	}

	public void create_directory(directoryHolder f, String name) throws already_exist{

	}

	public void delete_file(String name) throws no_such_file{

	}

	public int list_files(file_listHolder l){
		this.fileList = l.value;
		return this.number_of_file;
	}


	public int number_of_file(){
		return number_of_file;
	}	

}




