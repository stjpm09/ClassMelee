package ClanMeme;

public class DodgeTankMemberDecider implements clanmelee.ActionPointDecider {

    public DodgeTankMemberDecider() {

    }
    /**
     *
     * @param self the player
     * @param target the character the player is interacting with.
     *               the tank will always run away.
     * @return the amount of actionPoints used
     */
    @Override
    public int decideActionPoints(clanmelee.ClanMember self, clanmelee.ClanMember target) {
        return 0;
    }
}
