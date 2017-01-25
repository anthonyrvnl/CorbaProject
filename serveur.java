package files;

import org.omg.CORBA.*;

import org.omg.PortableServer.*;

import java.io.*;

import java.lang.*;

import java.util.*;


public class serveur {
	public static void main(String[] args) throws IOException {
		////////////////////////////////////////
		// Initialisation de l'ORB et de la POA 
		////////////////////////////////////////
		try {
			//init ORB
			ORB orb = ORB.init(args, null);

			//init POA
			POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			poa.the_POAManager().activate();

			////////////////////////////////////////////////////////////////
			// Instantiation de l'objet : creation de 
			//	l'implantation de l'objet
			////////////////////////////////////////////////////////////////
			directoryImpl dir = new directoryImpl(poa);

			// create the object reference
			org.omg.CORBA.Object dirRef = poa.servant_to_reference(dir);

			try {
				String calc_ref = orb.object_to_string(dirRef);
				String refFile = "dir.ref";
				PrintWriter out = new PrintWriter(new FileOutputStream(refFile));
				out.println(calc_ref);
				out.close();
			} catch (IOException ex) {
				System.err.println(
						"Impossible d'ecrire la reference dans dir.ref");
				System.exit(1);
			}

			System.out.println("Le serveur est pret ");

			// wait for requests
			orb.run();

			System.exit(0);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
