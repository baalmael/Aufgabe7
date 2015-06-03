package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.beobachtung;

import java.util.HashSet;

/**
 * Die zu beobachtenden Klassen können von dieser Klasse erben, 
 * sie stellt die Verwaltung und Benachrichtigung der Beobachter bereit.
 */
public abstract class Beobachtbar
{
    /**
     * Die Menge der registrierten Beobachter.
     */
    private HashSet<Beobachter> _beobachterSet;

    /**
     * Initialisiert einen neuen abstrakten Beobachter.
     */
    public Beobachtbar()
    {
        _beobachterSet = new HashSet<Beobachter>();
    }

    /**
     * Meldet den gegebenen Beoabachter an.
     * 
     * @param beobachter Ein Beobachter, der angemeldet werden soll.
     */
    public void registriereBeobachter(Beobachter beobachter)
    {
        _beobachterSet.add(beobachter);
    }

    /**
     * Meldet den gegebenen Beoabachter ab.
     * 
     * @param beobachter Ein Beobachter, der abgemeldet werden soll.
     */
    public void entferneBeobachter(Beobachter beobachter)
    {
        _beobachterSet.remove(beobachter);
    }

    /**
     * Informiert alle angemeldeten Beobachter dass eine relevante Änderung
     * eingetreten ist.
     */
    protected void informiereUeberAenderung()
    {
        for (Beobachter beobachter : _beobachterSet)
        {
            beobachter.reagiereAufAenderung(this);
        }
    }
}
