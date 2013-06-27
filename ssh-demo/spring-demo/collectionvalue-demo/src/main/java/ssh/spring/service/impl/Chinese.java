package ssh.spring.service.impl;

import ssh.spring.service.Axe;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/20/13
 * Time: 5:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chinese {

    private List<String> schools;
    private Map scores;
    private Map<String, Axe> phaseAxes;
    private Properties health;
    private Set axes;
    private String[] books;


    public Chinese(){
        System.out.println("Initialize Chinese...");
    }

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public Map getScores() {
        return scores;
    }

    public void setScores(Map scores) {
        this.scores = scores;
    }

    public Map<String, Axe> getPhaseAxes() {
        return phaseAxes;
    }

    public void setPhaseAxes(Map<String, Axe> phaseAxes) {
        this.phaseAxes = phaseAxes;
    }

    public Properties getHealth() {
        return health;
    }

    public void setHealth(Properties health) {
        this.health = health;
    }

    public Set getAxes() {
        return axes;
    }

    public void setAxes(Set axes) {
        this.axes = axes;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }
}
