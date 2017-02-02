package files;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import java.io.*;

/*
 * Permet aux clients de manipuler un fichier régulier particulier
 * 
 * */
 
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
		try {
			new FileOutputStream(name,true);
		} catch (IOException ex) {
			System.err.println("--Error creating file--");
			System.exit(1);
		}
	}

	/*
	 * Demande de lecture du fichier de size caracteres
	 * Le resultat est depose dans la chaine data
	 * Retourne le nombre d'elements lus
	 * */
	public int read(int size, StringHolder data) throws end_of_file, invalid_operation{
		if(this.offset >= this.size_of_file) throw new end_of_file();
		return 0;
	}

	/*
	 * Ecriture du fichier de size caracteres
	 * La chaine de caractere a ecrire est contenu dans data
	 * Retourne le nombre de caracteres ecrits
	 * */
	public int write(int size, String data) throws invalid_operation{
		return 0;
	}

	/*
	 * Positionne l'offset du fichier a la position new_offset
	 * */
	public void seek(int new_offset) throws invalid_offset, invalid_operation{
		if(new_offset < 0 || new_offset > this.size_of_file) throw new invalid_offset();
		else this.offset = new_offset;
	}

	/*
	 * Fermer le fichier
	 * Tout acces grace a la reference d'objet devient interdit
	 * */
	public void close(){
		
	}

}
