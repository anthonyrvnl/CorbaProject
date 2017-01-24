
package files;
import org.omg.CORBA.*;
import java.lang.*;
import org.omg.PortableServer.*;

public class directoryImpl extends directoryPOA {
	
	private int number_of_file;
	
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
		
		return 0;
	}


	public int number_of_file(){
		return number_of_file;
	}	
	
}
	
	


