package ClanMeme;

import java.util.ArrayList;

import static clanmelee.ClanMember.ClanMemberType.HEALER;

public class FrailHealerMember extends clanmelee.Clan {

    // Creates a Clan with the name "Frail Healer" and id of clanID
    public FrailHealerMember(int clanID) {
        super("Frail Healer", clanID);
    }

    /**
     *
     * @param hitPoints - The number of hit points to be distributed amongst all the clan members
     * @return - a clan (an ArrayList) of Frail Healers
     */
    @Override
    public ArrayList<clanmelee.ClanMember> getClanMembers(int hitPoints) {
        ArrayList<clanmelee.ClanMember> clanMembers = new ArrayList<>();

        clanmelee.ActionPointDecider decider = new FrailHealerMemberDecider();

        int adjHitPoints = hitPoints;

        while (adjHitPoints > 0) {
            int nextHP = 250;
            if (adjHitPoints < 250)
                nextHP = adjHitPoints;

            clanMembers.add(new clanmelee.ClanMember(getClanID(), HEALER, nextHP, decider));
            adjHitPoints -= nextHP;
        }
        return clanMembers;
    }
}
