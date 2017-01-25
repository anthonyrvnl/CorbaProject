
package files;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.PortableServer.*;

import java.util.*;
import java.io.*;
import java.lang.*;

public class serveur {
	public static void main(String args[]) throws IOException { 
		try {
			ORB orb = ORB.init(args, null);
			POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			poa.the_POAManager().activate();
			
			directoryImpl dir = new directoryImpl(poa);
			org.omg.CORBA.Object ref = poa.servant_to_reference(dir);
			
			org.omg.CORBA.Object obj = null;
			obj = orb.resolve_initial_references("NameService");
			if(obj == null){
				System.out.println("Reference null sur NameService");
				System.exit(1);
			}
			

			System.out.println("Le serveur est pret ");
			orb.run();
      
  
			System.exit(0);
		}
		catch(org.omg.CORBA.ORBPackage.InvalidName ex){
			System.out.println("org.omg.CORBA.ORBPackage.InvalidName sur orb.resolve_initial_references");
			System.exit(1);
		}
		catch(org.omg.PortableServer.POAManagerPackage.AdapterInactive ex){
			System.out.println("org.omg.PortableServer.POAManagerPackage.AdapterInactive sur activate() ");
			System.exit(1);
		}
		catch(Exception e){
			System.out.println(e);
		}
		

	}

}

