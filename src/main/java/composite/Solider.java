package composite;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tomasz on 19.01.15.
 */
public class Solider {

    private String name;
    private Set<Solider> team;

    public Solider(String name) {
        this.name = name;
        this.team = new HashSet<Solider>();
    }

    public void addMember(Solider member) {
        this.team.add(member);
    }

    public Set<Solider> getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Solider{" +
                "name='" + name + '\'' +
                ", team=" + team +
                '}';
    }
}
