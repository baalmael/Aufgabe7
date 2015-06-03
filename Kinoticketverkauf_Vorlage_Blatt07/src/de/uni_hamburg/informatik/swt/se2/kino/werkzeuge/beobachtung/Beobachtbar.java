package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.beobachtung;

import java.util.HashSet;

public abstract class Beobachtbar
{
    private HashSet<Beobachter> _beobachterSet;

    public Beobachtbar()
    {
        _beobachterSet = new HashSet<Beobachter>();
    }

    public void registriereBeobachter(Beobachter beobachter)
    {
        _beobachterSet.add(beobachter);
    }

    public void entferneBeobachter(Beobachter beobachter)
    {
        _beobachterSet.remove(beobachter);
    }

    protected void informiereUeberAenderung()
    {
        for (Beobachter beobachter : _beobachterSet)
        {
            beobachter.reagiereAufAenderung(this);
        }
    }
}
