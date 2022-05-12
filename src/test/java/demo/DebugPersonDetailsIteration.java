package demo;

import domain.Person;
import util.DataUtil;

import java.util.List;

public class DebugPersonDetailsIteration {
    public static void main(String[] args) {
       // List<Person> personList = DataUtil.getPersonData();
        List<Person> personList = DataUtil.getPersonListWithOtherDatatypes();
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            System.out.println(person);
        }

    }

}
