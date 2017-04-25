package ClanMeme;

public class LEEEEROOOOYJENKINSMemberDecider implements clanmelee.ActionPointDecider {

    private int actionPoints;

    /**
     * @Purpose: Instantiates an LEEEEROOOOYJENKINSMemberDecider
     * @param: actionPoints - how much damage LeeRoy Jenkins will deal
     * @return: None (constructor)
     */
    public LEEEEROOOOYJENKINSMemberDecider() {
        this.actionPoints = actionPoints;
    }

    /**
     * @purpose: Defines LEEEEROOOOYJENKINSMemberDecider's strategy.
     * @param: me - This attacker
     * @param: other - The clan member that is being attacked.
     * @return:
     */
    @Override
    public int decideActionPoints(clanmelee.ClanMember me, clanmelee.ClanMember other) {

        boolean clanIDsMatch = me.getClanID() == other.getClanID();
        int currentHealth = me.getHitPoints();

        //Note: this will also return 0 if clanID's match to prevent combat among
        //members from the same clan.
        if (!clanIDsMatch) {

            if (currentHealth == me.getMaxHitPoints()) {return currentHealth;}

            else {

                int halfHealth = currentHealth/2;

                if (halfHealth < 10) {return halfHealth;}
                else {return 10;}
            }
        }

        else {return 0;}
    }
}
