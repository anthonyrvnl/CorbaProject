package files;
import org.omg.CORBA.*;
import java.lang.*;
import org.omg.PortableServer.*;
import java.io.*;

/*
 * Permet de manipuler un répertoire
 * A partir d'un objet CORBA représentant un répertoire donné, 
 * Il est possible d'accéder aux fichiers réguliers et aux sous répertoires qu'il contient
 * */
 
public class directoryImpl extends directoryPOA {

	/*
	 * number_of_file : nombre de fichier et sous repertoire contenu dans le dossier
	 * */
	private int number_of_file;
	private file_list fileList;
	protected POA _poa;
	private String name;

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

	/*
	 * Ouvrir un fichier existant
	 * Le client obtient une reference d'objet Corba
	 * name : le fichier
	 * m : le mode d'ouverture
	 * 		read_only : offset positionne au debut du fichier
	 * 		write_append : offset a la fin du fichier, ajouter de nouvelle donnee
	 * 		write_trunc : offset au debut, reinitialise le contenu du fichier
	 * 		read_write : offset au debut, non reinitialisation du fichier
	 * 						remplacement des donnees par celle ecrite
	 * */
	public void open_regular_file(regular_fileHolder r, String name, mode m) throws invalid_type_file, no_such_file{
		
	}

	/*
	 * Obtenir une reference d'objet Corba
	 * Ouvrir un repertoire dans le repertoir courant
	 * name : nom du repertoire
	 * */
	public void open_directory(directoryHolder f, String name) throws invalid_type_file, no_such_file{

	}


	/*
	 * Creer un nouveau fichier dans le repertoire courant
	 * name : nom du fichier
	 * */
	public void create_regular_file(regular_fileHolder r, String name) throws already_exist{

	}

	/*
	 * Creer un repertoir dans le repertoir courant
	 * name : nom du repertoire
	 * */
	public void create_directory(directoryHolder f, String name) throws already_exist{

	}

	/*
	 * Supprime fichier ou repertoire dans le repertoire courant
	 * name : nom du fichier/repertoire
	 * */
	public void delete_file(String name) throws no_such_file{

	}

	/*
	 * Liste des fichiers et repertoires
	 * Retourne le nombre d'elements (fichiers et dossiers)
	 * file_list : reference d'objet Corba
	 * Iterateur pour acceder successivement les differents elements
	 * */
	public int list_files(file_listHolder l){
		this.fileList = l.value;
		return this.number_of_file;
	}


	public int number_of_file(){
		return number_of_file;
	}	

}
