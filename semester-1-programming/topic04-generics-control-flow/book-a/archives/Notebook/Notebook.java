import java.util.ArrayList;
import java.util.Iterator;
/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number.
            notes.remove(noteNumber);
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    /**
     * Show a note from the notebook if it exists.
     * @param noteNumber The number of the note to be displayed.
     */
    public void showNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number.
        }
        else if(noteNumber < numberOfNotes()) {
            System.out.println(notes.get(noteNumber));
        }
        else {
            // This is not a valid note number.
        }
    }

    /**
     * List all notes in the notebook.
     */
    //public void listNotes()
    //{
    //    for(String note : notes) {
    //        System.out.println(note);
    //    }
    //}

    /**
     * List all notes in the notebook.
     */
    //public void listNotes()
    //{
    //    int i = 0;
    //    while(i < notes.size()) {
    //        System.out.println(notes.get(i));
    //        i++;
    //    }
    //} 

    /**
     * List all notes in the notebook.
     */
    //public void listNotes()
    //{
    //    for(int i= 0; i < notes.size(); i++) {
    //        System.out.println(notes.get(i));
    //        
    //    }
    //}

	public void listNotes()
	{
		Iterator<String> iterator = notes.iterator();
		while (iterator.hasNext())
		{
			String note = iterator.next();
			System.out.println(note);
		}
	} 

}
