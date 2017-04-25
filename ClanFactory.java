package clanmelee;

import ClanMeme.ClanHaug;

import java.util.ArrayList;
import java.util.Collection;

public class ClanFactory {
    public Collection<Clan> getClans() {
        ArrayList<Clan> clans = new ArrayList<>();

        int clanID = 0;

        clans.add(new ClanHaug(clanID++));


        return clans;
    }
}
