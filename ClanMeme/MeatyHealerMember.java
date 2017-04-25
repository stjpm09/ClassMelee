package ClanMeme;

import java.util.ArrayList;

import static clanmelee.ClanMember.ClanMemberType.HEALER;

public class MeatyHealerMember extends clanmelee.Clan {

    // Creates a Clan with the name "Meaty Healer" and id of clanID
    public MeatyHealerMember(int clanID) {
        super("Meaty Healer", clanID);
    }

    /**
     *
     * @param hitPoints - The number of hit points to be distributed amongst all the clan members
     * @return - a clan (an ArrayList) of Meaty Healers
     */
    @Override
    public ArrayList<clanmelee.ClanMember> getClanMembers(int hitPoints) {
        ArrayList<clanmelee.ClanMember> clanMembers = new ArrayList<>();

        clanmelee.ActionPointDecider decider = new MeatyHealerMemberDecider();

        int adjHitPoints = hitPoints;

        while (adjHitPoints > 0) {
            int nextHP = 500;
            if (adjHitPoints < 500)
                nextHP = adjHitPoints;

            clanMembers.add(new clanmelee.ClanMember(getClanID(), HEALER, nextHP, decider));
            adjHitPoints -= nextHP;
        }
        return clanMembers;
    }


}
