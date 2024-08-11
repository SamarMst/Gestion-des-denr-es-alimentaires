package package0;

public class Recette {
private String RefRec;
private String NomRecette;
private String DescriptifRecette;
private int CaloriesRecette;
private String DIFFICULT;
private float TempsCuisson;
private float TempsPreparation;
private int NbPersonnes;


public Recette( String RefRecette,String nomRecette, String descriptifRecette, int caloriesRecette, String difficulte, float tempsCuisson, float tempsPreparation, int nbPersonnes) {
   this.RefRec=RefRecette;
	this.NomRecette = nomRecette;
    this.DescriptifRecette = descriptifRecette;
    this.CaloriesRecette = caloriesRecette;
    this.DIFFICULT = difficulte;
    this.TempsCuisson = tempsCuisson;
    this.TempsPreparation = tempsPreparation;
    this.NbPersonnes = nbPersonnes;

}
public String getRefRecette() {
	return RefRec;
}
public void setRefRecette(String refRecette) {
	RefRec = refRecette;
}
public String getNomRecette() {
	return NomRecette;
}
public void setNomRecette(String nomRecette) {
	NomRecette = nomRecette;
}
public String getDescriptifRecette() {
	return DescriptifRecette;
}
public void setDescriptifRecette(String descriptifRecette) {
	DescriptifRecette = descriptifRecette;
}
public int getCaloriesRecette() {
	return CaloriesRecette;
}
public void setCaloriesRecette(int caloriesRecette) {
	CaloriesRecette = caloriesRecette;
}
public String getDifficulte() {
	return DIFFICULT;
}
public void setDifficulte(String difficulte) {
	DIFFICULT = difficulte;
}
public float getTempsCuisson() {
	return TempsCuisson;
}
public void setTempsCuisson(float tempsCuisson) {
	TempsCuisson = tempsCuisson;
}
public float getTempsPreparation() {
	return TempsPreparation;
}
public void setTempsPreparation(float tempsPreparation) {
	TempsPreparation = tempsPreparation;
}
public int getNbPersonnes() {
	return NbPersonnes;
}
public void setNbPersonnes(int nbPersonnes) {
	NbPersonnes = nbPersonnes;
}



}