package ClanMeme;

import java.util.ArrayList;

import static clanmelee.ClanMember.ClanMemberType.WARRIOR;

public class LEEEEROOOOYJENKINSMember extends clanmelee.Clan {

    // Creates a Clan with the name "LEEEEROOOOY JENKINS" and id of clanID
    public LEEEEROOOOYJENKINSMember(int clanID) {
        super("LEEEEROOOOY JENKINS", clanID);
    }

    /**
     *
     * @param hitPoints - The number of hit points to be distributed amongst all the clan members
     * @return - a clan (an ArrayList) of Assassins
     */
    @Override
    public ArrayList<clanmelee.ClanMember> getClanMembers(int hitPoints) {
        ArrayList<clanmelee.ClanMember> clanMembers = new ArrayList<>();

        clanmelee.ActionPointDecider decider = new LEEEEROOOOYJENKINSMemberDecider();

        int adjHitPoints = hitPoints;

        while (adjHitPoints > 0) {
            int nextHP = 950;
            if (adjHitPoints < 950)
                nextHP = adjHitPoints;

            clanMembers.add(new clanmelee.ClanMember(getClanID(), WARRIOR, nextHP, decider));
            adjHitPoints -= nextHP;
        }
        return clanMembers;
    }

}
