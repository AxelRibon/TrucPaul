package lecture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Infos.ColonnesChemin;

public class Lecture {

	@SuppressWarnings("resource")
	public static ColonnesChemin ouvrirInfo() {
		ColonnesChemin retour = new ColonnesChemin();

		try {
			FileReader file = new FileReader("C:/Users/Axel/Desktop/PaulProjet/INFO.txt");
			BufferedReader buffered = new BufferedReader(file);

			String line = buffered.readLine();
			int i = 0;
			while (i == 0){
				String[] decompose = line.split(";");

				int colonnes = Integer.parseInt(decompose[0]);
				String chemin = decompose[1];

				retour.setColonnes(colonnes);
				retour.setChemin(chemin);

				i = 1;
				line = buffered.readLine();
			}

		}
		catch (Exception e) {
			throw new Error(e);
		}

		return retour;
	}
	
	public static List<String> lireExcel() throws IOException{

		List<String> test = new ArrayList<String>();
		
		ColonnesChemin colonnesChemin = new ColonnesChemin();
		
		colonnesChemin = ouvrirInfo();
		
		//File file = getExcel(colonnesChemin.getChemin());
		
		File file = new File(colonnesChemin.getChemin());
		
		System.out.println(file.getAbsolutePath());
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			test.add(line);
		}
		
		System.out.println(test);
		
		return null;
		
	}
	
    public static String getResourcePath(String fileName) {
        final File f = new File(fileName);
        final String dossierPath = f.getAbsolutePath() + File.separator + fileName;
        return dossierPath;
    }
	
	public static File getExcel(String fileName) {
		final String completeFileName = getResourcePath(fileName);
		File file = new File(completeFileName);
		return file;
	}
}
