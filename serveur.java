
package files;

import org.omg.CORBA.*;

public class Serveur {
	public static void main(String args[]) throws IOException { 
		try {
			ORB orb = ORB.init(args, null);
			POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			poa.the_POAManager().activate();

			/*
			usineImpl us = new usineImpl(poa);
  	             	org.omg.CORBA.Object refus  = poa.servant_to_reference(us);

			org.omg.CORBA.Object obj = null;
	               	obj = orb.resolve_initial_references("NameService");
       			if(obj == null)
				{
				System.out.println("Reference nil sur `NameService'");
				System.exit(1);
				}

			NamingContext nc = NamingContextHelper.narrow(obj);
			if(nc == null)
				{
				System.out.println("Reference type nil sur `NameService'");
				System.exit(1);
				}

			NameComponent[] aName = new NameComponent[1];
		       	aName[0] = new NameComponent();
		       	aName[0].id = "formations professionnelles";
		       	aName[0].kind = "usine";

          		nc.rebind(aName, refus);

			System.out.println("Le serveur est pret ");
			orb.run();
      
  
			System.exit(0);*/
		}

	}

}

