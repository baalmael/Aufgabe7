package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.beobachtung;

/**
 * * Interface für Beobachter, die sich für Änderungen eines Beobachtbaren
 * interessieren.
 */
public interface Beobachter
{
    /**
     * Diese Operation wird aufgerufen, sobald sich an an dem beobachteten
     * Subwerkzeug etwas relevantes geändert hat.
     * 
     * Implementierende Klassen müssen in dieser Operation auf die Aenderung
     * reagieren.
     * 
     * @param beobachtbar Der Beobachtbare
     */
    void reagiereAufAenderung(Beobachtbar beobachtbar);

}
