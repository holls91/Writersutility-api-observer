package it.holls.writersutility.observer;

public abstract class GUIObserver {

	public abstract void setOriginalText(String originalText);
	public abstract void setNewText(String newText);
	public abstract String getGUIText();
	public abstract String getOriginalText();
}
