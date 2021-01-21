package assignment03;

import java.util.*;

/*
    Bradley Estus
    B00780491
 */
public class Roster {

    private List<Student>classRoster;

    /**
     * No-argument constructor for the class roster.
     * Initializes empty ArrayList
     */
    public Roster(){
        this.classRoster = new ArrayList<>();
    }

    /**
     * Fetches the class roster
     * @return class roster as List
     */
    public List<Student> getClassRoster(){
        return classRoster;
    }

    /**
     *
     * Add Student object to the roster list
     * @param s student object to be added
     */
    public void addStudent(Student s){
        classRoster.add(s);
    }

    /**
     * Removes student by BNumber
     * Uses Iterator
     * @param bNumber student BNumber
     */
    public void dropStudent(String bNumber){
        Iterator<Student>classIterator = classRoster.iterator();
        while(classIterator.hasNext()){
            if(classIterator.next().getBNumber().equals(bNumber)){
                classIterator.remove();
                break;
            }
        }
    }

    /**
     * Removes student by BNumber
     * Uses enhanced for
     * @param bNumber student BNumber
     */
    public void dropStudent1(String bNumber){
        for(Student s : classRoster){
            if(s.getBNumber().equals(bNumber)){
                classRoster.remove(s);
                break;
            }
        }
    }

    /**
     * Removes student by BNumber
     * Uses standard for
     * @param bNumber student BNumber
     */
    public void dropStudent2(String bNumber){
        boolean removed = false;
        for(int i = 0; i < classRoster.size() && !removed; i++){
            if(classRoster.get(i).getBNumber().equals(bNumber)){
                classRoster.remove(i);
                removed = true;
            }
        }
    }

    /**
     * Overrides standard toString
     * Prints in format [name1 (bn1), name2 (bn2), name3 (bn3), ... nameN (bnN)]
     * @return String with names and BNumbers
     */
    @Override
    public String toString(){
        String x = "[";
        for(int i = 0; i <  classRoster.size(); i++){
            x += classRoster.get(i).getAsPerson().getFirstNames() + " " + classRoster.get(i).getAsPerson().getLastNames() + " (" + classRoster.get(i).getBNumber() + ")";
            if(i < classRoster.size()-1){
                x += ", ";
            }
        }
        x += "]";
        return x;
    }

    /**
     * Sorts class roster by BNumber
     * Uses Bubble Sort algorithm
     */
    public void sortByBNum(){
        for(int i = 0; i < classRoster.size(); i++){
            for(int j = 1; j < classRoster.size()-i; j++){
                if(classRoster.get(j-1).getBNumber().compareTo(classRoster.get(j).getBNumber())>0){
                    Student temp = classRoster.get(j-1);
                    classRoster.set(j-1, classRoster.get(j));
                    classRoster.set(j, temp);
                }
            }
        }
    }
}
