package ClanMeme;

public class FrailHealerMemberDecider implements clanmelee.ActionPointDecider {

    public FrailHealerMemberDecider() {}

    /**
     *
     * @param self the player
     * @param target the character the player is interacting with.
     *               If self and target are in the same clan, then the player will use all their actionPoints
     *               to heal the target. Else the player runs away.
     * @return the amount of actionPoints used
     */
    @Override
    public int decideActionPoints(clanmelee.ClanMember self, clanmelee.ClanMember target) {

        boolean clanIDsMatch = self.getClanID() == target.getClanID();

        if (clanIDsMatch) {
            return 10;
        }
        else {
            return 0;
        }
    }
}
