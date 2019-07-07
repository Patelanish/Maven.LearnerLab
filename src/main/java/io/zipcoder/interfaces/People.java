package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends  Person>  {
    public static Student[] getPersonList;
    private List<E>  PersonList = new ArrayList<E>();

    public void add(E person){
        PersonList.add(person);
    }

    public E findById (long id){
        for (E person: PersonList){
            if (Person.getId() == id){
                return person;
            }
        }
        return null;
    }
    public void remove(Person person){

        PersonList.remove(person);
    }

    public void remove(long id){

        PersonList.remove(findById(id));
    }

    public int getCount(){

        return PersonList.size();
    }
    public abstract E[] getArray();

    public void removeAll(){

        PersonList.clear();
    }
    public List<E> getPersonList(){

        return PersonList;
    }



}
