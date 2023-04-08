package org.inheritance;
//single inheritance
public class language extends stateDetails{
private void tamilLanguage() {
	System.out.println("dravidian Language");
}
private void EnglishLanguage() {
	System.out.println("British Language");
}
private void HindiLanguage() {
	System.out.println("Ariyan Langeage");
}
public static void main(String[] args) {
	language l = new language();
	l.northIndia();
	l.southIndia();
	l.tamilLanguage();
	l.EnglishLanguage();
	l.HindiLanguage();
}
}
