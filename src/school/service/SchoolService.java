package school.service;

import school.model.NameId;
import school.model.School;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolService implements ISchoolService {

    public List<School> schoolNameReset(List<School> schoolList) {

        School sc = new School();

        List<School> newlist = new ArrayList<>();

        for (School e : schoolList) {

            sc = new School();

            if (e.getSchoolID().length() >= 6)
                sc.setSchoolID(e.getSchoolID().substring(0,6)+"...");
            else
                sc.setSchoolID(e.getSchoolID());

            sc.setName_full(e.getName_full());
            sc.setCity(e.getCity());
            sc.setState(e.getCity());
            sc.setCountry(e.getCountry());

            newlist.add(sc);

            }
            return newlist;
        }

        public List<NameId> nameIdReset(List<School> list){

        NameId ni = new NameId();
        List<NameId> newlist = new ArrayList<>();

        for(School e : list){

            ni =new NameId();
            if(e.getSchoolID().length() >= 6)
                ni.setNameId(e.getSchoolID().substring(0,6)+"..." );
            else
                ni.setNameId(e.getSchoolID());

            newlist.add(ni);

        }
        return newlist;

        }
    }






