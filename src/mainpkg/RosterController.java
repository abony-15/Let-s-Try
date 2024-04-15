package mainpkg;

import java.util.ArrayList;
import java.util.List;

public class RosterController {
    private final List<RosterCheck> rosterChecks = new ArrayList<>();

    public void addRosterCheck(RosterCheck check) {
        rosterChecks.add(check);
    }

    public RosterCheck findRosterEntry(String nurseName, String id) {
        for (RosterCheck check : rosterChecks) {
            if (check.getNurseName().equals(nurseName) && check.getId().equals(id)) {
                return check;
            }
        }
        return null; // Not found
    }
}
