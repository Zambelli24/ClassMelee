package Team4Clan;

import java.util.ArrayList;

/**
 * Created by andrew on 4/22/17.
 */
public class Team4Clan extends clanmelee.Clan {

    public Team4Clan(int clanID){ super("Team4Clan", clanID);}

    @Override
    public ArrayList<clanmelee.ClanMember> getClanMembers(int hitPoints)
    {
        ArrayList<clanmelee.ClanMember> fullClanMembers = new ArrayList<>();

        if(hitPoints >= 5000)
        {
            ZambelliAttackerMember zam = new ZambelliAttackerMember(getClanID());
            Team4Clan.ZambelliAggressiveAttackerMember zaam = new Team4Clan.ZambelliAggressiveAttackerMember(getClanID());
            Team4Clan.ZambelliHealerMember zhm = new Team4Clan.ZambelliHealerMember(getClanID());
            ZambelliAggressiveHealerMember zahm = new ZambelliAggressiveHealerMember(getClanID());
            Team4Clan.ZambelliSpecialHealerMember zshm = new Team4Clan.ZambelliSpecialHealerMember(getClanID());

            fullClanMembers.addAll(zam.getClanMembers(hitPoints));
            fullClanMembers.addAll(zaam.getClanMembers(hitPoints));
            fullClanMembers.addAll(zhm.getClanMembers(hitPoints));
            fullClanMembers.addAll(zahm.getClanMembers(hitPoints));
            fullClanMembers.addAll(zshm.getClanMembers(hitPoints));

        }
        else
        {
            Team4Clan.CarrHealerMember carrHealer = new Team4Clan.CarrHealerMember(getClanID());
            CarrFighterMember carrFighter = new CarrFighterMember(getClanID());

            fullClanMembers.addAll(carrHealer.getClanMembers(hitPoints));
            fullClanMembers.addAll(carrFighter.getClanMembers(hitPoints));
        }
        return fullClanMembers;
    }
}
